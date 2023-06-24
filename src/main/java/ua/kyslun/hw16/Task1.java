package ua.kyslun.hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> getMapWithCountCharacters(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            map.put(str, str.length());
        }
        return map;
    }

}
