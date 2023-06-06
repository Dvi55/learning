package ua.kyslun.hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Taks2 {
    //Реализовать метод, который принимает список строк и возвращает Map с
    //ключом в виде количества букв в строке и значением - список строк
    //соответствующей длины.
    public static Map<Integer, List<String>> createMap(List<String> strings) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String lines : strings) {
            int length = lines.length();
            List<String> listInMap = map.getOrDefault(length, new ArrayList<>());
            listInMap.add(lines);
            map.put(length, listInMap);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World", "Java", "Programming");
        System.out.println(createMap(list));
        System.out.println(createMap(List.of("Hello", "Java", "Programming")));
        System.out.println(createMap(List.of("Hello", "Java", "Programming", "Hello")));
        System.out.println(createMap(List.of("Hello", "Java", "Programming", "Hello", "Hello")));
        System.out.println(createMap(List.of("Hello", "Java", "Programming", "Hello", "Hello", "Hello")));
        System.out.println(createMap(List.of("Hello", "Java", "Programming", "Hello", "Hello", "Hello", "Hello")));
        System.out.println(createMap(List.of("Hello", "Java", "Programming", "Hello", "Hello", "Hello", "Hello", "Hello")));
    }
}