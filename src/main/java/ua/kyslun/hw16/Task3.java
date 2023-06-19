package ua.kyslun.hw16;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        getTimeToOperationAdd(arrayList);
        getTimeToOperationAdd(linkedList);
        getTimeToOperationGet(arrayList);
        getTimeToOperationGet(linkedList);
    }

    private static void getTimeToOperationAdd(List<Integer> list) {
        Instant startAdd = Instant.now();
        addRandomToList(list);
        Instant finishAdd = Instant.now();
        long timeElapsedAdd = Duration.between(startAdd, finishAdd).toMillis();
        if (list instanceof ArrayList<Integer>) {
            System.out.println("Time elapsed for adding to ArrayList: " + timeElapsedAdd);
        } else if (list instanceof LinkedList<Integer>) {
            System.out.println("Time elapsed for adding to LinkedList: " + timeElapsedAdd);
        } else {
            System.out.println("Time elapsed for adding to other type of List: " + timeElapsedAdd);
        }
    }

    private static void getTimeToOperationGet(List<Integer> list) {
        Instant startGet = Instant.now();
        getRandomElement(list);
        Instant finishGet = Instant.now();
        long timeElapsedGet = Duration.between(startGet, finishGet).toMillis();
        if (list instanceof ArrayList<Integer>) {
            System.out.println("Time elapsed for get from ArrayList: " + timeElapsedGet);
        } else if (list instanceof LinkedList<Integer>) {
            System.out.println("Time elapsed for get from LinkedList: " + timeElapsedGet);
        } else {
            System.out.println("Time elapsed for get from other type of List: " + timeElapsedGet);
        }
    }


    public static void addRandomToList(List<Integer> list) {
        for (int i = 0; i <= 1000000; i++) {
            list.add(random.nextInt(5000));

        }
    }

    public static void getRandomElement(List<Integer> list) {
        for (int i = 0; i <= 1000000; i++) {
            list.get(random.nextInt(5000));
        }
    }
}

