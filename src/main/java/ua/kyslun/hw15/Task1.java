package ua.kyslun.hw15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(List.of(1, 2, 534, 5162562, 12, 34, 32, 55, 435, 43, 6546, 7, 65, 7634, 5321, 5324, 5, 76, 12433, 976, 5324, 35, 6787, 3, 6544, 36343, 5236, 326, 565, 6, 24656, 234));
        printWithForLoop(list);
        printWithForEachLoop(list);
        printWithWhileLoop(list);
        printWithIterator(list);
    }

    private static void printWithIterator(List<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }

    private static void printWithWhileLoop(List<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }
    }

    private static void printWithForEachLoop(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static void printWithForLoop(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}