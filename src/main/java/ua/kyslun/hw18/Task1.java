package ua.kyslun.hw18;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Task1 {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the file name");
        String name = scanner.nextLine();
        File file = new File(name + ".csv");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            while (true) {
                String writingLine = scanner.nextLine();
                if (writingLine.equals("end")) {
                    fileWriter.close();
                    break;
                } else if (writingLine.equals("next")) {
                    fileWriter.write("\n");
                } else {
                    fileWriter.write(writingLine);
                }
            }
        }
        scanner.close();
    }
}

