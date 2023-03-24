package ua.kislun.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Hello! It`s game 'guess the number'. I guessed a number from 1 to 10. try to guess.");
        Scanner scanner = new Scanner(System.in);
        int hiddenNumber = (int) (Math.random() * 10 + 1);
        while (true) {
            int userNumber = scanner.nextInt();
            if (hiddenNumber == userNumber) {
                System.out.println("Congratulation! You win!!");
                break;
            } else if (userNumber > hiddenNumber) {
                System.out.println("To much. Try again");
            } else if (userNumber < hiddenNumber) {
                System.out.println("Too few. Try again");
            }
        }
    }
}
