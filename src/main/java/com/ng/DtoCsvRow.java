package com.ng;

import java.util.*;
import org.jetbrains.annotations.NotNull;

public class DtoCsvRow {
    private String header1;
    private String header2;
    private String header3;
    private String header4;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    //Note: Constructor isn't auto-generated. Below has been written manually with the help of regex tools.
    public DtoCsvRow(@NotNull String[] csvRow) {
        int dataLength = csvRow.length;
        ArrayList<String> data = new ArrayList<>(Arrays.asList(csvRow));
        this.setHeader1(data.get(0));
        this.setHeader2(data.get(1));
        this.setHeader3(data.get(2));
        this.setHeader4(data.get(3));
    }

    public String getHeader1() {
        return this.header1;
    }

    public void setHeader1(String header1) {
        this.header1 = header1;
    }

    public String getHeader2() {
        return this.header2;
    }

    public void setHeader2(String header2) {
        this.header2 = header2;
    }

    public String getHeader3() {
        return this.header3;
    }

    public void setHeader3(String header3) {
        this.header3 = header3;
    }

    public String getHeader4() {
        return this.header4;
    }

    public void setHeader4(String header4) {
        this.header4 = header4;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DtoCsvRow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("Header1");
        sb.append('=');
        sb.append(((this.header1 == null)?"<null>":this.header1));
        sb.append(',');
        sb.append("Header2");
        sb.append('=');
        sb.append(((this.header2 == null)?"<null>":this.header2));
        sb.append(',');
        sb.append("Header3");
        sb.append('=');
        sb.append(((this.header3 == null)?"<null>":this.header3));
        sb.append(',');
        sb.append("Header4");
        sb.append('=');
        sb.append(((this.header4 == null)?"<null>":this.header4));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}