package com.example;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVStateCensus {

    private String filePath;

    public CSVStateCensus(String filePath) {
        this.filePath = filePath;
    }

    public List<String[]> readFile() {
        List<String[]> data = new ArrayList<>();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(filePath)).build()) {
            Iterator<String[]> iterator = reader.iterator();
            while (iterator.hasNext()) {
                String[] line = iterator.next();
                data.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
