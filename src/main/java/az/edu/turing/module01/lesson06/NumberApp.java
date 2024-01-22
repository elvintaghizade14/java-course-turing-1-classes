package az.edu.turing.module01.lesson06;

import java.util.Scanner;

public class NumberApp {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int sum = 0;
        long prod = 1;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            prod *= remainder;
            num /= 10;
        }

        System.out.println(sum);
        System.out.println(prod);
    }

}
