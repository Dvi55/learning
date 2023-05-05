package ua.kyslun.hw4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.kyslun.hw4.Task1.arithmeticAverage;
import static ua.kyslun.hw4.Task1.geometricAverage;

public class TestAverage {
    private static final double DELTA = 1e-15;
    @Test
    public void testArithmeticAverage() {
        int[] arr = {5, 5, 10, 10, 20};
        assertEquals(10.0, arithmeticAverage(arr));
    }

    @Test
    public void testArithmeticAverageWithSimilarNumber() {
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        assertEquals(2.0, arithmeticAverage(arr));
    }

    @Test
    public void testGeometricAverage() {
        int[] arr = {2, 4, 8};
        assertEquals(4, geometricAverage(arr), DELTA);
    }

    @Test
    public void testGeometricAverageWithSimilarNumber() {
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        assertEquals(2, geometricAverage(arr));
    }
}