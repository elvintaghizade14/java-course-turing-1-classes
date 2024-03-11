package az.edu.turing.module02.part02.lesson01;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final String line1 = in.nextLine();
        final String line2 = in.nextLine();

        final int number1 = Integer.parseInt(line1);
        final int number2 = Integer.parseInt(line2);
        int result = number1 / number2;

        System.out.println(result);

        foo(line1);
    }

    static void foo(String s) {
        foo(s);
    }
}
