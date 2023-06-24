package ua.kyslun.hw14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {
    MySet<String> set = new MySet<>(3);

    @Test
    void addTest() {
        assertTrue(set.add("one"));
    }

    @Test
    void addFalseTest() {
        set.add("one");
        assertFalse(set.add("one"));
    }

    @Test
    void containsTest() {
        set.add("one");
        assertTrue(set.contains("one"));
    }

    @Test
    void noContainsTest() {
        assertTrue(set.contains("one"));
    }

    @Test
    void suitableSizeTest() {
        set.suitableSize();
    }

    @Test
    void getTest() {
        set.add("one");
        assertEquals("one", set.get(0));
    }
}