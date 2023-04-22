package ua.kyslun.hw4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.kyslun.hw4.Task1.arithmeticAverage;
import static ua.kyslun.hw4.Task1.geometricAverage;

public class TestAverage {
    @Test
    public void testArithmeticAverage() {
        int[] arr = {5, 5, 10, 10, 20};
        assertEquals(10.0, arithmeticAverage(arr));
    }

    @Test
    public void testGeometricAverage() {
        int[] arr = {2, 4, 8};
        assertEquals(4, geometricAverage(arr));
    }
}