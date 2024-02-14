package az.edu.turing.module02.lesson02;

import java.util.Random;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
//        int  i;
//        System.out.println(i * 2);
        System.out.println(Student.globalString);
        System.out.println(Student.studentCount); //0

        Student student1 = new Student("Elvin #1", 28);
        System.out.println(student1.name);
//        System.out.println(Student.name);
        System.out.println(student1.grade);
        System.out.println(student1.age);
        System.out.println(student1);
        System.out.println(student1.studentCount); //1

        student1.studentCount = 14; //14

        Student student2 = new Student("Elvin #2", 29);
        System.out.println(student2.name);
        System.out.println(student2.grade);
        System.out.println(student2.age);
        System.out.println(student2);
        System.out.println(student2.studentCount); //2

        System.out.println(Student.studentCount); //2

        System.out.println(Math.random());
//        student1.finalize();
        Runtime.getRuntime().gc();
    }
}
