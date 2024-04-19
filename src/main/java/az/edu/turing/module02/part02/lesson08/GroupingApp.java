package az.edu.turing.module02.part02.lesson08;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingApp {

    public static void main(String[] args) {
        new Random()
                .ints(10, 0, 20)
                .peek(num -> System.out.printf("%d ", num))
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
