package api.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TestUtils {
    public static String getProperty(String propertyName) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/config/application.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }

    public static JsonArray getResponseBodyAsJsonArray(CloseableHttpResponse response) {
        int status = response.getCode();
        JsonArray array = null;
        if (status >= 200 && status < 300) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    Gson gson = new Gson();
                    array = gson.fromJson(line, JsonArray.class);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Unexpected response status: " + status);
        }
        return array;
    }
}
