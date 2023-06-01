package ua.kyslun.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AspirantTest {

    @Test
    public void testGetMaxScholarship() {
        Aspirant aspirant = new Aspirant("a", "b", 6);
        assertEquals(200, aspirant.getScholarship());
    }

    @Test
    public void testGetMinScholarship() {
        Aspirant aspirant1 = new Aspirant("a", "b", 2);
        assertEquals(180, aspirant1.getScholarship());
    }

    @Test
    public void testGetScholarshipWithZeroMark() {
        Aspirant aspirant2 = new Aspirant("a", "b", 0);
        assertEquals(180, aspirant2.getScholarship());
    }


    @Test
    public void testGetScholarshipWithMinusMark() {
        Aspirant aspirant3 = new Aspirant("a", "b", -3);
        assertEquals(180, aspirant3.getScholarship());
    }
}
