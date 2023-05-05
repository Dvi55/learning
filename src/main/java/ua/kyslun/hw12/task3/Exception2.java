package ua.kyslun.hw12.task3;

public class Exception2 extends Exception {
    public Exception2(String message) throws Exception2 {
        throw new Exception2("2");
    }
}
