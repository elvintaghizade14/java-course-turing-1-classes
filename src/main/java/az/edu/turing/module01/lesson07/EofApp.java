package az.edu.turing.module01.lesson07;

import java.util.Scanner;

public class EofApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long sum = 0;
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
        }

        System.out.println(sum);
    }

}
