package ua.kyslun.hw12.task3;

import java.util.Random;

class ExceptionThrow {
    public void throwAllExceptions() throws Exception1, Exception2, Exception3 {
        Random random = new Random();
        int exceptionNum = random.nextInt(1, 3);
        switch (exceptionNum) {
            case 1 -> throw new Exception1("e1");
            case 2 -> throw new Exception2("e2");
            case 3 -> throw new Exception3("e3");
        }
    }
}
