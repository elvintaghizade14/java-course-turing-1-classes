package az.edu.turing.module02.part02.lesson02;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {
        new Random()
                .ints(0, 100)
                .limit(10)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
