package az.edu.turing.module02.part02.lesson12;

public class Student extends Person {
    public Student(int age, String name, double heartAttackRate) {
        super(age, name, heartAttackRate);
    }

    @Override
    public void foo() {
        System.out.println("Student::foo()");
    }

    public void foo(int a) {
        System.out.println(a);
    }
}
