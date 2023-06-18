package ua.kyslun.hw12;

import ua.kyslun.hw12.task3.Exception1;
import ua.kyslun.hw12.task3.Exception2;
import ua.kyslun.hw12.task3.Exception3;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Exception");
        } catch (Exception1 e) {
            System.out.println(e.getMessage());
            System.out.println("Exception was processed. Program will continue");
        } finally {
            System.out.println("Finally block");
        }
    }
}
