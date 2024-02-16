package az.edu.turing.module02.lesson03;

public class Teacher extends Person {

    private double salary;

    public Teacher(String name,
                   int age,
                   double height,
                   boolean gender,
                   double salary) {
        super(name, age, height, gender);
        this.salary = salary;
    }
}
