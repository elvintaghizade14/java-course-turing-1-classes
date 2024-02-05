package az.edu.turing.module01.lesson12;

import java.util.Scanner;

public class ConditionalStatementApp {

    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        int y;
        if (x < 5) {
            y = x * x - 3 * x + 4;
        } else {
            y = x + 7;
        }

        System.out.println(y);
    }

}
