package main.java.com.service;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderJSON {

    public static void ReaderJSON(){
        try {
            String filePath = "C:\\cobol-java-integration\\src\\customers.json";
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            JSONObject jsonObject = new JSONObject(jsonString);

            JSONArray jsonArray = jsonObject.getJSONArray("customer");
            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject object = jsonArray.getJSONObject(i);
                System.out.println("Customer: " + object.toString());
            }
        } catch (Exception e) {
            System.err.println("Erro ao ler o JSON: " + e.getMessage());
        }
    }
}
