package ua.kyslun.hw21.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        A a = null;
        try {
            Class clazz = Class.forName(A.class.getName());
            Constructor<A> constructor = A.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            a = (A) constructor.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        Field[] fields = A.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
        }
        try {
            fields[0].set(a, "456");
            fields[1].set(a, "B");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
    }
}

