package ua.kyslun.hw16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

class Task1Test {
    @Test
    public void testGetMapWithCountCharacters() {
        ArrayList<String> list = new ArrayList<>();
        list.add("тут");
        list.add("там");
        list.add("стол");

        Map<String, Integer> map = Task1.getMapWithCountCharacters(list);

        Assertions.assertEquals(3, map.size());
        Assertions.assertEquals(3, Optional.ofNullable(map.get("тут")));
        Assertions.assertEquals(3, Optional.ofNullable(map.get("там")));
        Assertions.assertEquals(4, Optional.ofNullable(map.get("стол")));
    }
}
