package ua.kyslun.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


        Student student = new Student("a", "b", (-2));
        Student student1 = new Student("a", "b", 0);
        Student student2 = new Student("a", "b", 2);
        Student student3 = new Student("a", "b", 8);

        @Test
        public void testStudentWithMinusMark(){
            assertEquals(80, student.getScholarship());
        }
        @Test
        public void testStudentWithZeroMark(){
            assertEquals(80, student1.getScholarship());
        }
@Test
        public void testStudentWithPoorMark(){
            assertEquals(80, student2.getScholarship());
        }
@Test
        public void testStudentWithGoodMark(){
            assertEquals(100, student3.getScholarship());
        }

    }
