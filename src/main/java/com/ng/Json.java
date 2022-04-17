package com.ng;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.ng.DataModels.DataModel;
import org.apache.commons.lang3.NotImplementedException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Json {
    public Boolean logVerbose;
    public String outputFilePath;
    private ObjectMapper objectMapper;
    private static Gson gson;
    private UUID uuid;
    private DtoCsvRow dtoRecord;
    private com.ng.DataModels.DataModel dataModel;
    private String serializedModel;

    public Json(String outputFilePath, Boolean logVerbose) {
        this.uuid = java.util.UUID.randomUUID();
        this.logVerbose = logVerbose;
        this.outputFilePath = outputFilePath;
        this.objectMapper = new ObjectMapper();
        gson = new Gson();
        System.out.println(this.logObjectSignature() + "Constructed.");
    }

    //TODO
    public void convert() {
//        model = gson.fromJson(csvRow, com.ng.DataModels.DataModel.class);
        this.dataModel = new DataModel();
        try {
            this.dataModel = this.objectMapper.convertValue(this.dtoRecord, this.dataModel.getClass());
//            this.objectMapper.writeValue(new File(this.outputFilePath), new DataModel());
        }
        catch(Exception e) {

        }
    }

    public void setDtoRecord(DtoCsvRow dtoCsvRow) {
        this.dtoRecord = dtoCsvRow;
    }

    public String getSerializedModel() {
        if(serializedModel == null || serializedModel.isEmpty())
        {
            return dataModel.toString();
        }
        else return serializedModel;
    }

    public void appendToFile(@NotNull int recordNumber, @NotNull HashMap<String, List<String>> errors) {
        System.out.println("[appendToFile] Writing json number [" + recordNumber + "].");
        try {
            Files.write(Paths.get(outputFilePath), dataModel.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println("[appendToFile] Error writing json number [" + recordNumber + "] to file.");
            errors.get("toJsonFile").add(String.valueOf(recordNumber));
            //e.printStackTrace();
        }
    }

    public void addNode(String inputs, String targetNode) {
        throw new NotImplementedException();
    }

    private void deleteNode(String targetNode) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(pure = true)
    private String logObjectSignature() { return "[Json-" + this.uuid + "] "; }
}
