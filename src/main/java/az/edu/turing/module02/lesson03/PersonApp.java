package az.edu.turing.module02.lesson03;

public class PersonApp {

    public static void main(String[] args) {
        Student studentNezrin = new Student("Nezrin", 21, 1.57, true, 80.0);
        Teacher teacherElvin = new Teacher("Elvin", 28, 1.85, false, -10_000_000);

        System.out.println(studentNezrin.getName());
        System.out.println(teacherElvin.getName());

        Student studentVusal = new Student("Vusal");
        System.out.println(studentVusal.getName());
        System.out.println(studentVusal.getAge());
        studentVusal.wakeUp();

    }
}
