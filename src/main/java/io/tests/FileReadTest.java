package io.tests;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReadTest {
    public static List<String> readFileByLine(String fileName) {
        List<String> linesWihFile = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName)) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                linesWihFile.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesWihFile;
    }

    public static String readFileByBytes(String fileName) {
        String result = null;
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int i = -1;
            byte[] buffer = new byte[inputStream.available()];
            while ((i = inputStream.read()) != -1) {
                inputStream.read(buffer, 0, inputStream.available());
            }
            result = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result + " (прочитано побайтно)";
    }
}