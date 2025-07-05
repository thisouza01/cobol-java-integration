package main.java.com;
import main.java.com.model.Customer;
import main.java.com.service.CustomerJsonReader;
import main.java.com.service.JsonToFixedLengthConverter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Arquivo que vai conter o JSON
        String filePathCustomersJSON = "C:\\Users\\tihso\\IdeaProjects\\cobol-java-integration\\src\\customers.json";

        // Onde o arquivo vai criar o TXT
        String filePathCustomerTXT = "C:\\Users\\tihso\\IdeaProjects\\cobol-java-integration\\src\\";

        // instancio a classe
        CustomerJsonReader readJSON = new CustomerJsonReader();

        // chama o metodo e armazena o resultado em uma lista
        List<String> resultedList = readJSON.JsonReader(filePathCustomersJSON);

        // instancio a classe
        JsonToFixedLengthConverter converter = new JsonToFixedLengthConverter();

        // converter.fixedLengthConverter(resultedList, filePathCustomerTXT);

    }
}