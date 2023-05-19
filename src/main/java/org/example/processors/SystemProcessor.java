package org.example.processors;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.opencsv.CSVWriter;
import org.example.entities.system.System;

import java.io.*;
import java.nio.file.Files;

public class SystemProcessor {
    static final CsvMapper mapper = new CsvMapper();
    static final CsvSchema schema = mapper.schemaFor(System.class);
    
    
    //TODO break up logic, add a SystemPlain format to map from System object for GSON
    public static void process(File inputFile, File outputFile) {
        try {
            InputStream inputStream = Files.newInputStream(inputFile.toPath());
            JsonReader reader = new JsonReader(new InputStreamReader(inputStream));
            
            FileWriter outputWriter = new FileWriter(outputFile);
            CSVWriter csvWriter = new CSVWriter(outputWriter);
            
            reader.beginArray();
            int count = 0;
            while (reader.hasNext()) {
                count++;
                java.lang.System.out.println(count);
                
                System system = new Gson().fromJson(reader, System.class);
                
                java.lang.System.out.println(system);
                
                String temp = mapper.writer(schema.withUseHeader(true)).writeValueAsString(system);
                
                String[] data = temp.split(",");
                
                csvWriter.writeNext(data);
            }
            
            reader.endArray();
            csvWriter.close();
            
        } catch (IOException e) {
            java.lang.System.out.println(e.getMessage());
        }
    }
}
