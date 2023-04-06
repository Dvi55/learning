package ua.kyslun.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type a word or phrase");
        String input = scanner.nextLine();
        String newPhrase = deleteSpacebars(input);
        System.out.println(newPhrase);
        System.out.println(isPalindrome(deleteSpacebars(input)));
    }

    public static String deleteSpacebars(String textFromConsole) {
        return textFromConsole.replaceAll("\\s", "");
    }

    public static String isPalindrome(String phrase) {
        StringBuilder stringBuilder = new StringBuilder(phrase);
        if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
            return "It is palindrome!";
        }
        return "It is`t palindrome";
    }
}
