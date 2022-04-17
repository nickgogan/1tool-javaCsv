package com.ng;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.gson.Gson;
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
        /* Test
        String inputCsvFilePath = "C:\\[00] Work\\Tech\\[02] Projects\\Java\\tool-javaCsv\\src\\main\\resources\\TestData.csv";
        String csvHeadersFile = "C:\\[00] Work\\Tech\\[02] Projects\\Java\\tool-javaCsv\\src\\main\\resources\\TestHeaders.txt";*/
        //Config
        String csvHeadersFile = "C:\\[00] Work\\[01] Local\\DnB_FA\\cols.txt";
        String[] csvDataFiles = new String[]{ "C:\\[00] Work\\[01] Local\\DnB_FA\\exp1.csv",  "C:\\[00] Work\\[01] Local\\DnB_FA\\exp2.csv", "C:\\[00] Work\\[01] Local\\DnB_FA\\exp3.csv"};
        String outputDataPath = ""; //TODO
        Boolean analyze = true;
        Boolean logVerbose = false;

        //Init
        long startTime = System.nanoTime();
        Json outputJson = new Json(outputDataPath, logVerbose);
        CSVReader csvHeaderFile = new CSVReader(new FileReader(csvHeadersFile));
        Report runReport = new Report(1,1);
        System.out.println("Initialized");

        //Get the headers
        List<String[]> inHeaders = csvHeaderFile.readAll();
        List<String> headers = new ArrayList<String>();
        //Note: toArray() returns Object[] if an arr is not supplied. Providing a new String[0] works better for modern JVM.
        for(String[] inHeader : inHeaders) { headers.add(inHeader[0]); }
        runReport.setAggregateAnalysis(new CsvDescription(headers.toArray(new String[0])));
        csvHeaderFile.close();
        System.out.println("Captured headers.");

        for(String csvDataFile : csvDataFiles)
        {
            System.out.println("Processing file [" + csvDataFile + "].");
            Csv currentCsv = new Csv(csvDataFile, headers.toArray(new String[0]),logVerbose);
            Path currentCsvPath = Paths.get(csvDataFile);
            int csvRecordNumber = 0; //Reset record number for each csv for easier troubleshooting.
            try {
                currentCsv.openCsvFile();
                runReport.updateCsvDataVolume(Files.size(currentCsvPath));
                String[] csvRow;
                if(analyze){ System.out.println("Analyzing file [" + csvDataFile + "]."); }
                while((csvRow = currentCsv.readLine(currentCsvPath.getFileName().toString(), csvRecordNumber, runReport.errors)) != null)
                {
                    if(analyze) {
                        currentCsv.analyzeRow(csvRow);
                    }
                    DtoCsvRow dtoRecord = new DtoCsvRow(csvRow);
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

//            System.out.println("Creating POJO for file ["+csvDataFile+"].");
//            CsvMapper csvMapper = new CsvMapper();
//            csvMapper.configure(CsvParser.Feature.TRIM_SPACES, true);
//            csvMapper.configure(CsvParser.Feature.SKIP_EMPTY_LINES, true);
//            CsvSchema csvSchema = csvMapper
//                    .typedSchemaFor(DtoCsvRow2.class)
//                    .withoutHeader()
//                    .withoutComments();
//            MappingIterator<DtoCsvRow2> itDtoCsv = csvMapper.readerWithSchemaFor(DtoCsvRow2.class).readValues(csvDataFile);
//            DtoCsvRow2 dtoRector = itDtoCsv.next();
//            System.out.println();
//            CsvSchema csvSchema = csvMapper
//                    .typedSchemaFor(DtoCsvRow2.class)
//                    .withoutHeader()
//                    .withColumnSeparator(',')
//                    .withoutComments();
//            MappingIterator<DtoCsvRow2> itDtoCsv = csvMapper
//                    .readerFor(DtoCsvRow2.class)
//                    .with(csvSchema)
//                    .readValues(csvDataFile);
//            DtoCsvRow2 test = itDtoCsv.next();
//            List<DtoCsvRow2> dtoCsv = itDtoCsv.readAll();
//
//            System.out.println(dtoCsv.get(0).getAcctNo());
        }
        long estimatedTime = System.nanoTime() - startTime;
        runReport.setRunDuration(estimatedTime);
        //TODO
        //runReport.setJsonFileSize(outputDataPath);

        //Report
        if(analyze) {
            runReport.printAnalysis();
            runReport.printReport();
        }
    }
}
