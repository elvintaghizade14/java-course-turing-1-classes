package az.edu.turing.module02.lesson10;

public class StudentApp {

    public static void main(String[] args) {
        Student elvin = new Student(28, "Elvin", new double[]{99, 100, 98.3});
        System.out.println(elvin);

        elvin.getGrades()[0] = 71;
        System.out.println(elvin);

        elvin.getName().toCharArray()[0] = '-';
        System.out.println(elvin);
    }
}
