package main.java.com.service;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomerJsonReader {

    public List<String> JsonReader(String filePath){
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            JSONObject jsonObject = new JSONObject(jsonString);

            JSONArray jsonArray = jsonObject.getJSONArray("customer");
            // Gera uma lista
            List<String> customerList = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject object = jsonArray.getJSONObject(i);

                customerList.add(object.toString());

                System.out.println("Customer: " + object.toString());
            }

            return customerList;
        } catch (Exception e) {
            System.err.println("Erro ao ler o JSON: " + e.getMessage());
        }
        return null;
    }
}
