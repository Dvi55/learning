package ua.kyslun.hw12.task3;

class Exception1 extends Exception {
    public Exception1(String message) throws Exception1 {
       throw new Exception1("1");
    }
}
