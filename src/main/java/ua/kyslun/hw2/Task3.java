package ua.kyslun.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть послідовно 3 числа");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println("Найменше число " + smallestValue(firstNumber, secondNumber, thirdNumber));
    }

    public static int absoluteValue(int number) {
        return (number <= 0) ? -number : number;
    }

    public static int smallestValue(int firstNumber, int secondNumber, int thirdNumber) {
        if (absoluteValue(firstNumber) < absoluteValue(secondNumber) && absoluteValue(firstNumber) < absoluteValue(thirdNumber)) {
            return firstNumber;
        } else if (absoluteValue(secondNumber) < absoluteValue(firstNumber) && absoluteValue(secondNumber) < absoluteValue(thirdNumber)) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
