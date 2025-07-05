package main.java.com.service;

import main.java.com.model.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonToFixedLengthConverter {

    public void fixedLengthConverter(List<String> customers, String filePath)throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for (String customer : customers){
                String line = formatRecord(customer);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    private static String formatRecord(String customer){
        return String.format("%-4s%-20s%010.2f",

    }
}
