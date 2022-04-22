package com.ng;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Note: Column labels/headers come from a separate file.
public class Csv {
    public CSVReader csvReader;
    public CsvDescription csvDescription;
    public Boolean logVerbose;
    public String[] valueFilters;
    private String filePath;
    private UUID uuid;
    private FileReader fileReader;

    public Csv(String inputPath, String[] headers, Boolean logVerbose) {
        this.uuid = java.util.UUID.randomUUID();
        this.filePath = inputPath;
        this.logVerbose = logVerbose;
        this.csvDescription = new CsvDescription(this.filePath, this.uuid, headers, logVerbose);
        System.out.println(this.logObjectSignature() + "Constructed.");
    }

    public Csv(String inputPath, String[] headers, String[] valueFilters, Boolean logVerbose) {
        this.uuid = java.util.UUID.randomUUID();
        this.filePath = inputPath;
        this.logVerbose = logVerbose;
        this.csvDescription = new CsvDescription(this.filePath, this.uuid, headers, logVerbose);
        this.valueFilters = valueFilters;
        System.out.println(this.logObjectSignature() + "Constructed.");
    }
    public UUID getCsvId() {return this.uuid;}

    public Boolean close() {
        Boolean result = false;
        System.out.println(this.logObjectSignature() + "Finalizing.");
        try {
            this.csvReader.close();
            result = true;
        }
        catch (IOException e) {
            System.out.println(this.logObjectSignature());
            e.printStackTrace();
        }
        return result;
    }

    public long getCounts() {
        long result;
        try {
            result = this.csvReader.readAll().size();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
        this.csvDescription.rowCount = result;
        System.out.println("[Csv.getCount] Total count: [" + result + "].");
        return result;
    }

    @Nullable
    public String[] readLine(String fileName, int currentRecordNumber, HashMap<String, List<String>> errorLog) {
        String[] row;

        try {
            row = this.csvReader.readNext();
            if (logVerbose) {
                System.out.println(this.logObjectSignature() + "Reading csv record number [" + currentRecordNumber + "] from file ["+fileName+"].");
            }
            return row;
        }
        catch(CsvValidationException e) {
            System.out.println("Invalid row for record [" + currentRecordNumber + "].");
            errorLog.get("fromCsvFile").add(String.valueOf(currentRecordNumber));
            return null;
            //e.printStackTrace(); //Debug
        }
        catch(IOException e) {
            System.out.println("IO exception for record [" + currentRecordNumber + "].");
            errorLog.get("ioException").add(String.valueOf(currentRecordNumber));
            return null;
            //e.printStackTrace(); //Debug
        }
    }

    public void analyzeRow(@NotNull String[] row)
    {
        //Note: OpenCSV does NOT right-pad the rows to meet the number of headers!
        int rowLength = row.length;
        if(rowLength < this.csvDescription.headersCount) {
            int lengthDiff = this.csvDescription.headersCount - rowLength;
            int colIndex = 0;
            for(; colIndex < rowLength; colIndex++)
            {
                if(isInvalid(row[colIndex]))
                {
                    this.csvDescription.emptyCounts[colIndex] += 1;
                }
            }
            for(; colIndex < rowLength + lengthDiff; colIndex++)
            {
                this.csvDescription.emptyCounts[colIndex] += 1;
            }
        }
        else {
            for(int colIndex = 0; colIndex < this.csvDescription.headersCount; colIndex++) {
                if(isInvalid(row[colIndex]))
                {
                    this.csvDescription.emptyCounts[colIndex] += 1;
                }
            }
        }
    }
    public CSVReader openCsvFile() {
        if (this.csvReader == null) {
            try {
                CSVParser parser = new CSVParserBuilder()
                        .withSeparator(',')
                        .withIgnoreQuotations(true)
                        .build();
                this.csvReader = new CSVReaderBuilder(new FileReader(this.filePath)).withCSVParser(parser).build();
            }
            catch (FileNotFoundException e) {
                System.out.println(this.logObjectSignature() + "Input csv file not found.");
                e.printStackTrace();
            }
        }

        return this.csvReader;
    }

    @NotNull
    private Boolean isInvalid(String fieldValue)
    {
        if(fieldValue == null || fieldValue.isEmpty()) { return true; }
        if(this.valueFilters == null || this.valueFilters.length == 0) { return false; }
        String trimmedFieldValue = fieldValue.trim();
        for(String test : this.valueFilters) {
            if(test.equals(trimmedFieldValue)) {
                return true;
            }
        }
        return false;
    }
    @NotNull
    @Contract(pure = true)
    private String logObjectSignature() {
        return "[Csv-" + this.uuid + "] ";
    }
}
