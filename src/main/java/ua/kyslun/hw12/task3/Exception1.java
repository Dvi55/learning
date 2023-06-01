package ua.kyslun.hw12.task3;

public class Exception1 extends Exception {
    public Exception1(String message) {
        try {
            throw new Exception1("1");
        } catch (Exception1 e) {
            throw new RuntimeException(e);
        }
    }
}
