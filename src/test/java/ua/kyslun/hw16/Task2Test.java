package ua.kyslun.hw16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task2Test {
    @Test
    public void testStringLengthMap() {
        List<String> strings = Arrays.asList("тут", "там", "стол");
        Map<Integer, List<String>> lengthMap = Task2.createMap(strings);
        Assertions.assertEquals(2, lengthMap.size());
        Assertions.assertEquals(Arrays.asList("тут", "там"), lengthMap.get(3));
        Assertions.assertEquals(Arrays.asList("стол"), lengthMap.get(4));
    }

    @Test
    public void testEmptyList() {
        List<String> strings = Arrays.asList();
        Map<Integer, List<String>> lengthMap = Task2.createMap(strings);
        Assertions.assertEquals(0, lengthMap.size());
    }
}
