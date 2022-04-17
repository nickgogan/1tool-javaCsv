package com.ng;

import com.opencsv.CSVReader;
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

    @Nullable
    public String[] readLine(int currentRecordNumber, HashMap<String, List<String>> errorLog) {
        String[] row;

        //TODO: Create blacklist of records per file.
        //250180 is from csv1
        //357802 is from csv2
        if(currentRecordNumber == 357802 || currentRecordNumber == 250180)
        {
            return null;
        }

        try {
            row = this.csvReader.readNext();
            if (logVerbose) {
                System.out.println(this.logObjectSignature() + "Reading csv record number [" + currentRecordNumber + "].");
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

    public void analyzeRowEntries(@NotNull String[] row)
    {
        //Note: OpenCSV does NOT right-pad the rows to meet the number of headers!
        //Note: OpenCSV does maintain
        int rowLength = row.length;
        if(rowLength < this.csvDescription.headersCount) {
            int lengthDiff = this.csvDescription.headersCount - rowLength;
            int colIndex = 0;
            for(; colIndex < rowLength; colIndex++)
            {
                if(row[colIndex] == null || row[colIndex].isEmpty())
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
                if(row[colIndex] == null || row[colIndex].isEmpty())
                {
                    this.csvDescription.emptyCounts[colIndex] += 1;
                }
            }
        }
    }
    public CSVReader openCsvFile() {
        if (this.csvReader == null) {
            try {
                this.csvReader = new CSVReader(new FileReader(this.filePath));
            }
            catch (FileNotFoundException e) {
                System.out.println(this.logObjectSignature() + "Input csv file not found.");
                e.printStackTrace();
            }
        }

        return this.csvReader;
    }

    private Boolean isInvalid(String fieldValue) {
        Boolean result = false;
        String[] filter = new String[] {"-", "--"};
        for(String test : filter) {
            if(test.equals(fieldValue)) {
                result = true;
            }
        }
        return result;
    }
    @NotNull
    @Contract(pure = true)
    private String logObjectSignature() {
        return "[Csv-" + this.uuid + "] ";
    }
}
