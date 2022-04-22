package com.ng;

import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Report {
    public UUID runId;
    public Date runDate;
    public long runTimeMilliseconds;
    public int csvDataVersion;
    public int csvRecordCount;
    public long csvDataVolume;

    public CsvDescription aggregateAnalysis;
    HashMap<String, List<String>> errors;
    public Report(int csvDataVersion) {
        this.runId = java.util.UUID.randomUUID();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.runDate = new Date();
        this.csvDataVersion = csvDataVersion;
        this.csvRecordCount = 0;
        this.csvDataVolume = 0;
        errors = new HashMap<String, List<String>>();
        errors.put("fromCsvFile", new ArrayList<String>());
        errors.put("ioException", new ArrayList<String>());
    }

    public void updateCsvDataVolume(long csvFileSize) {
        this.csvDataVolume += csvFileSize;
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
        //Sanity check
        if(this.aggregateAnalysis == null) {
            System.out.println("[Report.printAnalysis] Null aggregate CsvDescription.");
            return;
        }
        if(this.aggregateAnalysis.headers.length != this.aggregateAnalysis.emptyCounts.length) {
            System.out.println("[printAnalysis] Mismatched number of headers & empties!");
        }
        else {
            System.out.println(getReportSeparator());
            System.out.println("Input CSV Analysis");
            HashMap<Integer, List<String>> map = new HashMap<>();
            for(int i = 0; i < this.aggregateAnalysis.headers.length; i++) {
                int currentKey = this.aggregateAnalysis.emptyCounts[i];
                if(!map.containsKey(currentKey)) {
                    map.put(currentKey, new ArrayList<String>());
                }
                map.get(currentKey).add(this.aggregateAnalysis.headers[i]);
            }
            SortedSet<Integer> mapKeys = new TreeSet<>(map.keySet());
            System.out.println("\n" + "Null Fields Counts");
            for(Integer key : mapKeys) {
                //Count 0 means that the column appears for all records
                System.out.println("Column [" +key+"] missing "+map.get(key));
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
        System.out.println("CSV data version                   : " + "v"+this.csvDataVersion);
        System.out.println("Total CSV records                  : " + this.csvRecordCount);
        System.out.println("Total CSV size                     : " + FileUtils.byteCountToDisplaySize(this.csvDataVolume));
        System.out.println("Avg CSV record size                : " + FileUtils.byteCountToDisplaySize(getAvgRecordSizeInBytes(csvRecordCount, csvDataVolume)));
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
