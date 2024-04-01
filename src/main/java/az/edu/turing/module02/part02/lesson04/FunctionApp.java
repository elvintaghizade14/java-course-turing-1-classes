package az.edu.turing.module02.part02.lesson04;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {
        Function<String, Integer> strToInt = new Function<>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> strToInt2 = s -> Integer.parseInt(s);
        Function<String, Integer> strToInt3 = Integer::parseInt;

        System.out.println(strToInt.apply("42"));
        System.out.println(strToInt.apply("221b"));
    }
}
