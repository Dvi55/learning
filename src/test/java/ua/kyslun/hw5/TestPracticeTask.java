package ua.kyslun.hw5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.kyslun.hw5.practice.Task1.*;
import static ua.kyslun.hw5.practice.Task2.*;


public class TestPracticeTask {

    @Test
    public void testBoysGrowthAverage() {
        int[] arr = {-130, 160, -130, -100, 50};
        assertEquals(120, calcBoysAvgHeight(arr));
    }

    @Test
    public void testGirlsGrowthAverage() {
        int[] arr = {-130, 160, -130, -100, 40, 200, 60};
        assertEquals(115, calcGirlsAvgHeight(arr));
    }

}
