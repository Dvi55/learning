package ua.kyslun.hw10;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() >= 5) {
            return 200;
        } else {
            return 180;
        }
    }

}