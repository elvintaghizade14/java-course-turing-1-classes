package az.edu.turing.module02.part02.lesson04;

import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {
        Predicate<Integer> isEven = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Predicate<Integer> isEven2 = integer -> integer % 2 == 0;

        System.out.println(isEven.test(3));
        System.out.println(isEven.test(4));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
