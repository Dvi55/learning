package ua.kyslun.hw10;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        if (getAverageMark() >= 5) {
            return 100;
        } else {
            return 80;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.getAverageMark(), getAverageMark()) == 0 && getFirstName().equals(student.getFirstName()) && getLastName().equals(student.getLastName()) && getGroup().equals(student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGroup(), getAverageMark());
    }
}
