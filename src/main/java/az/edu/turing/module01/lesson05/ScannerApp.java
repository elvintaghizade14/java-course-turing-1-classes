package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        // input
        System.out.print("Enter a number:\t");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // process
        String result = number % 2 == 0 ? "EVEN" : "ODD";

        // output
        System.out.println(result);
    }
}
