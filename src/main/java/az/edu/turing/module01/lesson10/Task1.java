package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        boolean b1 = number % 2 == 0;
        boolean b2 = number < 0 && (-number) % 3 == 0;

        System.out.println(b1 != b2 ? "YES" : "NO");
    }

}
