package az.edu.turing.module02.part01.lesson03;

public class Person {

    private String name;
    private int age;
    private double height;
    private boolean gender;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, double height, boolean gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public void wakeUp() {
        System.out.println("Mama, 5 deyqe de nolaarrr...");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
