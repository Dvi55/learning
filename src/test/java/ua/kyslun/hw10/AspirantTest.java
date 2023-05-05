package ua.kyslun.hw10;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AspirantTest {

        Aspirant aspirant = new Aspirant("a", "b", 6);
        Aspirant aspirant1 = new Aspirant("a", "b", 2);
        Aspirant aspirant2 = new Aspirant("a", "b", 0);
        Aspirant aspirant3 = new Aspirant("a", "b", -3);

    @Test
    public void testGetMaxScholarship() {
        assertEquals(200, aspirant.getScholarship());
    }

    @Test
    public void testGetMinScholarship() {
        assertEquals(180, aspirant1.getScholarship());
    }
    @Test
    public void testGetScholarshipWithZeroMark() {
        assertEquals(180, aspirant2.getScholarship());
    }
    @Test
    public void testGetScholarshipWithMinusMark() {
        assertEquals(180, aspirant3.getScholarship());
    }
}
