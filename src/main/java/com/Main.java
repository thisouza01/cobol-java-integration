package main.java.com;

import main.java.com.service.CustomerJsonReader;

public class Main {
    public static void main(String[] args){
        // Le Arquivo JSON
        // Apontar posteriormente para o local que o COBOL irá criar o arquivo JSON.
        String filePath = "C:\\Users\\tihso\\IdeaProjects\\cobol-java-integration\\src\\customers.json";
        CustomerJsonReader readJSON = new CustomerJsonReader(filePath);


    }
}
