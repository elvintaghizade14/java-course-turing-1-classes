package az.edu.turing.module02.part02.lesson12;

public class Person {

    private int age;
    private String name;
    private double heartAttackRate;

    public Person(int age, String name, double heartAttackRate) {
        this.age = age;
        this.name = name;
        this.heartAttackRate = heartAttackRate;
    }

    public void foo() {
        System.out.println("Person::foo()");
    }

    @Override
    public String toString() {
        return String.format("{age=%d, name='%s', heartAttackRate=%s}", age, name, heartAttackRate);
    }
}
