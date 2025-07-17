package main.java.com.service;

import main.java.com.model.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonToFixedLengthConverter {

    public void fixedLengthConverter(List<Customer> customers , String filePath)throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for (Customer customer : customers){
                String line = formatRecord(customer);
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    private static String formatRecord(Customer customer){
        return String.format("%-4s%-20s%010.2f",
                customer.getId(),
                customer.getName(),
                customer.getBalance());
    }
}
