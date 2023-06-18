package ua.kyslun.hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    //Реализовать метод, который принимает список строк и возвращает Map с
    //ключом в виде количества букв в строке и значением - список строк
    //соответствующей длины.
    public static Map<Integer, List<String>> createMap(List<String> strings) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String line : strings) {
            int length = line.length();
            List<String> listInMap = map.getOrDefault(length, new ArrayList<>());
            listInMap.add(line);
            map.put(length, listInMap);
        }
        return map;
    }
}