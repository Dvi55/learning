package ua.kyslun.hw12;

import static ua.kyslun.hw12.Task2.f;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
        f();
    }
}
