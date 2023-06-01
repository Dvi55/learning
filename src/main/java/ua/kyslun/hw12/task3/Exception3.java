package ua.kyslun.hw12.task3;

public class Exception3 extends Exception {
    public Exception3(String message) {
        try {
            throw new Exception3("3");
        } catch (Exception3 e) {
            throw new RuntimeException(e);
        }
    }
}
