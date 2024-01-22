package az.edu.turing.module01.lesson06;

import java.util.Scanner;

public class ControlFlowApp {

    public static void main(String[] args) {
        System.out.println("Enter number of month: ");
        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (num < 0) {
            System.out.println("negative");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
    }

}
