package ua.kyslun.hw10;

public class main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", "Chaves", 4.5),
                new Aspirant("Kate", "Bravo", 3),
                new Student("Nick", "Bells", 6),
                new Student("Trisha", "Morales", 8),
                new Aspirant("Travis", "Scott", 5.2),
                new Aspirant("Nicki", "Minaj", 7.55),
                new Student("Trevor", "Santina", 2.5)
        };
        for (Student student : students) {
            System.out.println(student.getScholarship());
        }

    }
}
