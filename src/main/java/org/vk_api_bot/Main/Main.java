package org.vk_api_bot.Main;

import org.vk_api_bot.Utils.LombokTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        ObjectMapper om = new ObjectMapper();
        String jsonString = "{\"name\": \"Gaben\", \"isAlive\": true, \"age\": \"55\"}";
        String jsonString1 = "{\"name\": \"Gaben\", \"age\": \"55\"}";

        try {
            LombokTest lt = om.readValue(jsonString1,LombokTest.class);
            System.out.println(lt.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
