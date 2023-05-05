package ua.kyslun.hw12;

public class Task2 {
    public static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("2");
        }
    }

    public static void g() throws Exception {
        throw new Exception("1");
    }
}
