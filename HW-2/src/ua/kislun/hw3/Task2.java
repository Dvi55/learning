package ua.kislun.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type a word or phrase");
        String input = scanner.nextLine();
        System.out.println("In your phrase " + wordsNumber(input) + "word(s)");
    }

    public static int wordsNumber(String input) {
        int wordCounter = 1;
        for (int i = 0; i < input.toCharArray().length; i++) {
            if (input.charAt(i) == ' ') {
                wordCounter++;
            }
        }
        return wordCounter;
    }
}
