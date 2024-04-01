package az.edu.turing.module02.part02.lesson04;

import java.util.stream.IntStream;

public class StreamApp {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100)
                .filter(value -> value % 2 == 0)
                .map(operand -> operand * 7)
                .forEach(System.out::println);
    }
}
