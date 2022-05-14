package io.tests.task_3;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static io.tests.FileReadTest.readFileByLine;

public class Test {
    public static void main(String[] args) {
        List<String> result = readFileByLine("src/main/resources/encodingFile.txt");
        result.forEach(System.out::println);
        result.forEach(string -> {
            byte[] ptext = string.getBytes(StandardCharsets.UTF_8);
            System.out.println(new String(ptext));
        });

    }
}
