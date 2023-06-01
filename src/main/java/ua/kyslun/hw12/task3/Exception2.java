package ua.kyslun.hw12.task3;

public class Exception2 extends Exception {
    public Exception2(String message) {
        try {
            throw new Exception2("2");
        } catch (Exception2 e) {
            throw new RuntimeException(e);
        }
    }
}
