package com.ng;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws CsvException, IOException {
        /* Test
        String inputCsvFilePath = "C:\\[00] Work\\Tech\\[02] Projects\\Java\\tool-javaCsv\\src\\main\\resources\\TestData.csv";
        String csvHeadersFile = "C:\\[00] Work\\Tech\\[02] Projects\\Java\\tool-javaCsv\\src\\main\\resources\\TestHeaders.txt";*/
        //Config
        String csvHeadersFile = "C:\\[00] Work\\[01] Local\\DnB_FA\\cols.txt";
        String[] csvDataFiles = new String[]{ "C:\\[00] Work\\[01] Local\\DnB_FA\\exp1.csv",  "C:\\[00] Work\\[01] Local\\DnB_FA\\exp2.csv", "C:\\[00] Work\\[01] Local\\DnB_FA\\exp3.csv"};
        String outputDataPath = ""; //TODO
        Boolean analyze = true;
        Boolean logVerbose = true;

        //Init
        long startTime = System.nanoTime();
        Json outputJson = new Json(outputDataPath, logVerbose);
        CSVReader csvHeaderFile = new CSVReader(new FileReader(csvHeadersFile));
        Report runReport = new Report(1,1);

        //Get the headers
        List<String[]> inHeaders = csvHeaderFile.readAll();
        List<String> headers = new ArrayList<String>();
        //Note: toArray() returns Object[] if an arr is not supplied. Providing a new String[0] works better for modern JVM.
        //Source:
        for(String[] inHeader : inHeaders) { headers.add(inHeader[0]); }
        runReport.setAggregateAnalysis(new CsvDescription(headers.toArray(new String[0])));
        csvHeaderFile.close();

        //Process data CSVs
        for(String csvDataFile : csvDataFiles)
        {
            System.out.println("Processing file [" + csvDataFile + "].");
            Csv currentCsv = new Csv(csvDataFile, headers.toArray(new String[0]),logVerbose);
            int csvRecordNumber = 0; //Reset record number for each csv for easier troubleshooting.
            try {
                currentCsv.openCsvFile();
                runReport.updateCsvDataVolume(Files.size(Paths.get(csvDataFile)));
                String[] row;
                while((row = currentCsv.readLine(csvRecordNumber, runReport.errors)) != null)
                {
                    if(analyze) { currentCsv.analyzeRowEntries(row); }
                    //Note: Trim values!
                    csvRecordNumber++;
                    runReport.csvRecordCount++;

                    //Transform to Json here.
                    //Append json to file here.
                }
            }
            catch (Exception e)
            {
                System.out.println("Exception while iterating through data.");
            }
            finally {
                if(analyze) {
                    runReport.updateAnalysis(currentCsv.csvDescription);
                }
                currentCsv.close();
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        runReport.setRunDuration(estimatedTime);

        //Report
        if(analyze) {
            runReport.printAnalysis();
        }
        runReport.printReport();
    }
}
