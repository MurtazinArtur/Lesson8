package io.tests.task_2;

import java.util.List;

import static io.tests.FileReadTest.readFileByBytes;
import static io.tests.FileReadTest.readFileByLine;

public class Test {
    public static void main(String[] args) {
        System.out.println(readFileByBytes("src/main/resources/readFile.txt"));
    }
}
