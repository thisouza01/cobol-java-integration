package main.java.com;

import main.java.com.service.CustomerJsonReader;

import java.util.List;

public class Main {
    public static void main(String[] args){
        // Le Arquivo JSON e retorna uma lista
        // Apontar posteriormente para o local que o COBOL irá criar o arquivo JSON.
        String filePath = "C:\\Users\\tihso\\IdeaProjects\\cobol-java-integration\\src\\customers.json";
        // instancio a classe
        CustomerJsonReader readJSON = new CustomerJsonReader();

        // chama o metodo e armazena o resultado em uma lista
        List<String> resultedList = readJSON.JsonReader(filePath);
    }
}
