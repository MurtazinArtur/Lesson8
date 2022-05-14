package io.tests.task_1;

import java.util.List;

import static io.tests.FileReadTest.readFileByLine;

public class Test {
    public static void main(String[] args) {
        List<String> result = readFileByLine("src/main/resources/readFile.txt");
        result.forEach(System.out::println);
    }
}
