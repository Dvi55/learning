package ua.kyslun.hw12.task3;

public class Main {

    public static void main(String[] args) {
        ExceptionThrow exceptionThrow = new ExceptionThrow();
        try {
            exceptionThrow.throwAllExceptions();
        } catch (Exception1 | Exception2 | Exception3 exception) {
            System.out.println("Exception caught");
        }
    }
}
