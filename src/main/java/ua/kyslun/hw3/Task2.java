package ua.kyslun.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type a word or phrase");
        String input = scanner.nextLine();
        System.out.println("In your phrase " + wordsNumber(input) + "word(s)");
    }

    public static int wordsNumber(String input) {
        int wordCounter = input.split("[-#$%^&!?,.0-9\\s]+").length;
        return wordCounter;
    }
}
