package az.edu.turing.module02.part02.lesson12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class StudentApp {

    public static void main(String[] args) {
        Student ali = new Student(19, "Ali", 190);

        Class<? extends Student> clazz = ali.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));
        System.out.println(Arrays.toString(clazz.getClasses()));

        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            System.out.println(declaredMethod.toString());
        }
    }
}
