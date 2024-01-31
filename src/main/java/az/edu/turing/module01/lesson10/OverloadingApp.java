package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class OverloadingApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double num2 = scan.nextDouble();

        int result1 = sum(num);
        double result2 = sum(num2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static int sum(int num) {
        return num + 2;
    }

    private static double sum(double num) {
        return num + 2;
    }

}
