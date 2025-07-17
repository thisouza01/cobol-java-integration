package main.java.com.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomerJsonReader {

    public void JsonReader(String filePath) {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\cobol-java-integration\\src\\output.txt"))) {
                writer.write(jsonString);
            }

            System.out.println("Arquivo TXT criado com sucesso: " + "C:\\cobol-java-integration\\src\\output.txt");
        } catch (Exception e) {
            System.err.println("Erro ao ler o JSON: " + e.getMessage());
        }
    }
}
