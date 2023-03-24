package ua.kislun.hw2;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число(ціле) для перевірки");
        int numberFromConsole = scanner.nextInt();
        System.out.println(checkEven(numberFromConsole));
    }

    public static String checkEven(int number) {
        return (number % 2 == 0) ? "Число парне" : "Число не парне";
    }
}
