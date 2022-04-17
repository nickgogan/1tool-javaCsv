package com.ng;

import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Report {
    public UUID runId;
    public Date runDate;
    public long runTimeMilliseconds;
    public int csvDataVersion;
    public int csvRecordCount;
    public long csvDataVolume;

    public int jsonModelVersion;
    public int jsonRecordCount;
    public long jsonDataVolume;
    public CsvDescription aggregateAnalysis;
    HashMap<String, List<String>> errors;
    public Report(int jsonModelVersion, int csvDataVersion) {
        this.runId = java.util.UUID.randomUUID();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.runDate = new Date();
        this.csvDataVersion = csvDataVersion;
        this.csvRecordCount = 0;
        this.csvDataVolume = 0;
        this.jsonModelVersion = jsonModelVersion;
        this.jsonRecordCount = 0;
        this.jsonDataVolume = 0;
        errors = new HashMap<String, List<String>>();
        errors.put("fromCsvFile", new ArrayList<String>());
        errors.put("csvToJsonConversion", new ArrayList<String>());
        errors.put("toJsonFile", new ArrayList<String>());
        errors.put("ioException", new ArrayList<String>());
    }

    public void updateCsvDataVolume(long csvFileSize) {
        this.csvDataVolume += csvFileSize;
    }

    public void setJsonFileSize(String outputDataPath) {
        try {
            this.jsonDataVolume = Files.size(Paths.get(outputDataPath));
        }
        catch(IOException e) {
            System.out.println("[report.setJsonFileSize] Error getting file size for output JSON ["+outputDataPath+"].");
            e.printStackTrace();
        }
    }

    public void setAggregateAnalysis(CsvDescription aggregateAnalysis) {
        this.aggregateAnalysis = aggregateAnalysis;
    }
    public void setRunDuration(long runTimeNanoseconds) {
        this.runTimeMilliseconds = TimeUnit.MILLISECONDS.convert(runTimeNanoseconds, TimeUnit.NANOSECONDS);;
    }

    public void updateAnalysis(CsvDescription csvDescription) {
        if(csvDescription == null) {
            System.out.println("[Report.updateAnalysis] Null csv analysis.");
            return;
        }
        if (this.aggregateAnalysis.emptyCounts.length != csvDescription.emptyCounts.length) {
            System.out.println("[Report.updateAnalysis] Aggregate analysis length does not match current analysis length.");
            return;
        }

        for(int i = 0; i < csvDescription.emptyCounts.length; i++) {
            aggregateAnalysis.emptyCounts[i] += csvDescription.emptyCounts[i];
        }
    }

    public void printAnalysis()
    {
        if(this.aggregateAnalysis == null) {
            System.out.println("[Report.printAnalysis] Null aggregate CsvDescription.");
            return;
        }

        System.out.println(getReportSeparator());
        //Sanity check
        if(this.aggregateAnalysis.headers.length != this.aggregateAnalysis.emptyCounts.length) {
            System.out.println("[printAnalysis] Mismatched number of headers & empties!");
        }
        else {
            HashMap<Integer, List<String>> map = new HashMap<>();
            for(int i = 0; i < this.aggregateAnalysis.headers.length; i++) {
                int currentKey = this.aggregateAnalysis.emptyCounts[i];
                if(!map.containsKey(currentKey)) {
                    map.put(currentKey, new ArrayList<String>());
                }
                map.get(currentKey).add(this.aggregateAnalysis.headers[i]);
            }
            SortedSet<Integer> mapKeys = new TreeSet<>(map.keySet());
            for(Integer key : mapKeys) {
                System.out.println("Empty count " +key+": "+map.get(key));
            }
            System.out.println("Total CSV records: " + this.csvRecordCount);
        }
    }

    public void printReport() {
        System.out.println(getReportSeparator());
        System.out.println("Run Report");
        System.out.println("");
        System.out.println("Run id                             : " + this.runId);
        System.out.println("Run date                           : " + this.runDate);
        System.out.println("Run duration (ms)                  : " + this.runTimeMilliseconds);
        System.out.println("CSV data version                   : " + this.csvDataVersion);
        System.out.println("Total CSV records                  : " + this.csvRecordCount);
        System.out.println("Total CSV size                     : " + FileUtils.byteCountToDisplaySize(this.csvDataVolume));
        System.out.println("Avg CSV record size                : " + FileUtils.byteCountToDisplaySize(getAvgRecordSizeInBytes(csvRecordCount, csvDataVolume)));
        System.out.println("JSON model version                 : " + this.jsonModelVersion);
        System.out.println("Total JSON records                 : " + this.jsonDataVolume);
        System.out.println("Total JSON size                    : " + FileUtils.byteCountToDisplaySize(this.jsonDataVolume));
        //System.out.println("Avg JSON record size               : " + FileUtils.byteCountToDisplaySize(getAvgRecordSizeInBytes(jsonRecordCount, jsonDataVolume)));
        System.out.println("");
        System.out.println("Errors:");
        Set<String> errorTypes = errors.keySet();
        for(String errorType : errorTypes) {
            System.out.println(errorType + ":" + errors.get(errorType).toString());
        }
    }

    @NotNull
    @Contract(pure = true)
    public static String getReportSeparator() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    public static long getAvgRecordSizeInBytes(int recordCount, long dataVolume)
    {
        return dataVolume / (long) recordCount;
    }
}
