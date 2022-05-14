package io.tests.task_6;

import com.google.gson.Gson;
import io.tests.task_6.models.City;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestParserJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try(BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/test.json"))){
            City city = gson.fromJson(bf, City.class);
            System.out.println(city);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
