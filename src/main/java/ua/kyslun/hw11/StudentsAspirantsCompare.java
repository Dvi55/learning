package ua.kyslun.hw11;

import ua.kyslun.hw10.Aspirant;
import ua.kyslun.hw10.Student;

public class StudentsAspirantsCompare {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Popov", "IT", 4.5);
        Student student1 = new Student("Ivan", "Popov", "IT", 4.5);
        Student student3 = new Student("Ivan", "Popov", "IT", 4.4);
        Student student2 = new Student("Andrey", "Pop", "Economy", 6.5);
        Aspirant aspirant = new Aspirant("Petro", "Ivanov", "IT", 5.5, "Math");
        Aspirant aspirant1 = new Aspirant("Petro", "Ivanov", "IT", 5.5, "Math");
        Aspirant aspirant2 = new Aspirant("Roman", "Vasiliev", "Medicine", 8, "Cardiology");
        System.out.println(student.equals(student1));
        System.out.println(student.equals(student2));
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(aspirant.equals(aspirant1));
        System.out.println(aspirant.equals(aspirant2));
        System.out.println(aspirant2.equals(aspirant1));
    }
}
