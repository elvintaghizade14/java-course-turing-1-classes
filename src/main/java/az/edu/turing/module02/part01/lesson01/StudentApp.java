package az.edu.turing.module02.part01.lesson01;

public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student("Elvin", 28);

        System.out.println(student1.name);
        System.out.println(student1.grade);
        System.out.println(student1.age);
        System.out.println(student1);
    }
}
