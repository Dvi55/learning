package ua.kyslun.hw16;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Instant startAdd = Instant.now();
        addRandomToList(arrayList, linkedList);
        Instant finishAdd = Instant.now();
        long timeElapsedAdd = Duration.between(startAdd, finishAdd).toMillis();
        Instant startGet = Instant.now();
        getRandomElement(arrayList, linkedList);
        Instant finishGet = Instant.now();
        long timeElapsedGet = Duration.between(startGet, finishGet).toMillis();
    }

    public static void addRandomToList(ArrayList<Integer> list, LinkedList<Integer> linkedList) {
        for (int i = 0; i <= 1000000; i++) {
            list.add(random.nextInt(5000));
            linkedList.add(random.nextInt(5000));
        }
    }

    public static void getRandomElement(ArrayList<Integer> list, LinkedList<Integer> linkedList) {
        for (int i = 0; i <= 1000000; i++) {
            list.get(random.nextInt(5000));
            linkedList.get(random.nextInt(5000));
        }
    }
}

