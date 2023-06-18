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
        Instant startAdd = Instant.now();
        addRandomToList(arrayList);
        addRandomToList(linkedList);
        Instant finishAdd = Instant.now();
        long timeElapsedAdd = Duration.between(startAdd, finishAdd).toMillis();
        System.out.println("Time elapsed for adding to Lists: " + timeElapsedAdd);
        Instant startGet = Instant.now();
        getRandomElement(linkedList);
        getRandomElement(arrayList);
        Instant finishGet = Instant.now();
        long timeElapsedGet = Duration.between(startGet, finishGet).toMillis();
        System.out.println("Time elapsed for get from Lists: " + timeElapsedGet);
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

