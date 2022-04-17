package com.ng;

import com.google.gson.Gson;
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
    private UUID uuid;
    private Gson gson;
    private com.ng.DataModels.DataModel model;
    private String serializedModel;

    public Json(String outputFilePath, Boolean logVerbose) {
        this.uuid = java.util.UUID.randomUUID();
        this.logVerbose = logVerbose;
        this.outputFilePath = outputFilePath;
        gson = new Gson();
        System.out.println(this.logObjectSignature() + "Constructed.");
    }

    public void convert(String csvRow) {
        model = gson.fromJson(csvRow, com.ng.DataModels.DataModel.class);
    }

    public String getSerializedModel() {
        if(serializedModel == null || serializedModel.isEmpty())
        {
            return model.toString();
        }
        else return serializedModel;
    }

    public void appendToFile(@NotNull int recordNumber, @NotNull HashMap<String, List<String>> errors) {
        System.out.println("[appendToFile] Writing json number [" + recordNumber + "].");
        try {
            Files.write(Paths.get(outputFilePath), model.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
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
