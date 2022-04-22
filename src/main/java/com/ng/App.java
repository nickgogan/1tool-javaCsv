package com.ng;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws CsvException, IOException {
        //Config.
        String[] csvDataFiles = new String[] {"C:\\[00] Work\\Tech\\[02] Projects\\Java\\tool-javaCsv\\src\\main\\resources\\TestData.csv"};
        String csvHeadersFile = "C:\\[00] Work\\Tech\\[02] Projects\\Java\\tool-javaCsv\\src\\main\\resources\\TestHeaders.txt";
        String[] valueFilters = new String[] {"-", "--"};
        Boolean analyze = true;
        Boolean logVerbose = true;

        //Init.
        long startTime = System.nanoTime(); //Uses JVM's internal clock instead of the OS clock, which is less reliable for measuring runtime.
        CSVReader csvHeaderFile = new CSVReader(new FileReader(csvHeadersFile));
        Report runReport = new Report(1);
        System.out.println("Initialized");

        //Get the headers.
        List<String[]> inHeaders = csvHeaderFile.readAll();
        List<String> headers = new ArrayList<String>();
        for(String[] inHeader : inHeaders) { headers.add(inHeader[0]); }
        //Note: toArray() returns Object[] if an arr is not supplied. Providing a new String[0] works better for modern JVM.
        runReport.setAggregateAnalysis(new CsvDescription(headers.toArray(new String[0])));
        csvHeaderFile.close();
        System.out.println("Captured headers.");

        //Process each CSV file.
        for(String csvDataFile : csvDataFiles)
        {
            System.out.println("Processing file [" + csvDataFile + "].");
            Csv currentCsv = new Csv(csvDataFile, headers.toArray(new String[0]), valueFilters, logVerbose);
            Path currentCsvPath = Paths.get(csvDataFile);
            int csvRecordNumber = 0; //Reset record number for each csv for easier troubleshooting.
            try {
                currentCsv.openCsvFile();
                runReport.updateCsvDataVolume(Files.size(currentCsvPath));
                String[] csvRow;
                if(analyze){ System.out.println("Analyzing file [" + csvDataFile + "]."); }
                while((csvRow = currentCsv.readLine(currentCsvPath.getFileName().toString(), csvRecordNumber, runReport.errors)) != null)
                {
                    DtoCsvRow dtoRecord = new DtoCsvRow(csvRow);
                    if(analyze) { currentCsv.analyzeRow(csvRow); }
                    csvRecordNumber++;
                    runReport.csvRecordCount++;
                }
            }
            catch (Exception e)
            {
                System.out.println("Exception while iterating through data.");
            }
            finally {
                System.out.println("Analyzed ["+csvRecordNumber+"] records in file ["+csvDataFile+"].");
                runReport.updateAnalysis(currentCsv.csvDescription);
                currentCsv.close();
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        runReport.setRunDuration(estimatedTime);

        //Report
        if(analyze) {
            runReport.printAnalysis();
            runReport.printReport();
        }
    }
}
