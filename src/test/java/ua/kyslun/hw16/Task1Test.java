package ua.kyslun.hw16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

class Task1Test {
    @Test
    public void testGetMapWithCountCharacters() {
        ArrayList<String> list = new ArrayList<>();
        list.add("тут");
        list.add("там");
        list.add("стол");

        Map<String, Integer> map = Task1.getMapWithCountCharacters(list);

        Assertions.assertEquals(3, map.size());
        Assertions.assertEquals(3, (map.get("тут")));
        Assertions.assertEquals(3, (map.get("там")));
        Assertions.assertEquals(4, (map.get("стол")));
    }

    @Test
    public void testGetMapWithCountCharactersEmpty() {
        ArrayList<String> list = new ArrayList<>();

        Map<String, Integer> map = Task1.getMapWithCountCharacters(list);

        Assertions.assertEquals(0, map.size());
    }
}
