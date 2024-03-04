package az.edu.turing.module02.lesson10;

import java.time.LocalDate;

public class Teacher extends Person {

    private double experience;

    public Teacher(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public void happyBirthDate() {
        if (LocalDate.now().equals(birthDate)) {
            System.out.println(birthDate + "! " + name + ", happy birth day 2 u :)");
        }
    }
}
