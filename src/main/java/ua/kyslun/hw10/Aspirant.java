package ua.kyslun.hw10;

import java.util.Objects;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aspirant aspirant = (Aspirant) o;
        return Objects.equals(scientificWork, aspirant.scientificWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scientificWork);
    }
}