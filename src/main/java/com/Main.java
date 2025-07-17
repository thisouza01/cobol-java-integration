package main.java.com;

import main.java.com.model.Customer;
import main.java.com.service.CustomerJsonReader;
import main.java.com.service.JsonToFixedLengthConverter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Le Arquivo JSON e retorna uma lista
        // Apontar posteriormente para o local que o COBOL irá criar o arquivo JSON.
        // instancio a classe
        CustomerJsonReader readJSON = new CustomerJsonReader();
        readJSON.JsonReader("C:\\cobol-java-integration\\src\\customers.json");

    }
}
