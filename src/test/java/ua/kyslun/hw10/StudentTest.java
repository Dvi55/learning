package ua.kyslun.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    public void testStudentWithMinusMark() {
        Student student = new Student("a", "b", (-2));
        assertEquals(80, student.getScholarship());
    }

    @Test
    public void testStudentWithZeroMark() {
        Student student1 = new Student("a", "b", 0);
        assertEquals(80, student1.getScholarship());
    }

    @Test
    public void testStudentWithPoorMark() {
        Student student2 = new Student("a", "b", 2);
        assertEquals(80, student2.getScholarship());
    }

    @Test
    public void testStudentWithGoodMark() {
        Student student3 = new Student("a", "b", 8);
        assertEquals(100, student3.getScholarship());
    }

}
