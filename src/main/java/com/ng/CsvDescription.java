package com.ng;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CsvDescription {
    public String[] headers;
    public int[] emptyCounts;
    public int headersCount;

    private String filename;
    private UUID csvUUID;

    public CsvDescription(String filename, UUID csvUUID, String[] headers, Boolean logHeaders)
    {
        this.filename = filename;
        this.csvUUID = csvUUID;
        this.setHeaders(headers, logHeaders);
    }

    public CsvDescription(String[] headers) {
        this.setHeaders(headers, false);
    }

    public void setHeaders(String[] headerRow, Boolean logHeaders) {
        if(headerRow != null && headerRow.length > 0) {
            this.headers = headerRow;
            this.emptyCounts = new int[this.headers.length];
            this.headersCount = this.headers.length;
        }
        else { System.out.println(this.logObjectSignature() + "Null or empty header row."); }
    }
    public String getFilename() {return this.filename;}
    public UUID getCsvUUID() {return this.csvUUID;}

    public void logHeaders() {
        //Sanity check
        if(this.headers.length != this.emptyCounts.length) {
            System.out.println("[CsvDescription.logHeaders] Failed sanity check. Investigate!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.headers.length; i++) {
            sb.append(this.headers[i] + ",");
        }
        System.out.println("[CsvDescription.logHeaders] Headers: " + sb.toString());
    }

    @NotNull
    @Contract(pure = true)
    private String logObjectSignature() {return "[CsvDescription-" + this.csvUUID + "]. ";}
}
