package az.edu.turing.module02.part02.lesson02;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        System.out.println(divide(5, 0));
        System.out.println(divide(25, 10));

        divide(16, 0)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.err.println("EMPTY!!!")
                );
    }

    private static Optional<Integer> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of(a / b);
    }
}
