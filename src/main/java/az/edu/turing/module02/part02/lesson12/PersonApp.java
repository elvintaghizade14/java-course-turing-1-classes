package az.edu.turing.module02.part02.lesson12;

import java.util.Arrays;

public class PersonApp {

    public static void main(String[] args) {
        Person person1 = new Person(25, "Elvin", 190);
        System.out.println(person1);

        Person person2 = new Person(22, "Vusal", 1.1);
        System.out.println(person2);

        System.out.println(person1.getClass().getName());
        System.out.println(person1.getClass().getSimpleName());

        Class<? extends Person> clazz = person1.getClass();
        System.out.println(Arrays.toString(clazz.getFields()));
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
        System.out.println(Arrays.toString(clazz.getDeclaredAnnotations()));
        System.out.println("---");
        System.out.println(Arrays.toString(clazz.getMethods()));
    }
}
