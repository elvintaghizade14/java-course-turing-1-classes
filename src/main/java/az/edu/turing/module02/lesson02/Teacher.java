package az.edu.turing.module02.lesson02;

public class Teacher {

    private String name;
    private double salary;
    private int experience;
    private boolean gender;

    public Teacher(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
//        return name.substring(0, 3);
        return this.name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        }
    }

    public double getSalary() {
        return -1000;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
