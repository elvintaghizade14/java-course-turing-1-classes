package az.edu.turing.module01.lesson06;

import java.util.Scanner;

public class GradeApp {

    public static void main(String[] args) {
        System.out.print("Enter your grade please: ");
        final double grade = new Scanner(System.in).nextDouble();

        String result;
        if (grade >= 91 && grade <= 100) {
            result = "A";
        } else if (grade >= 81) {
            result = "B";
        } else if (grade >= 71) {
            result = "C";
        } else if (grade >= 61) {
            result = "D";
        } else if (grade >= 51) {
            result = "E";
        } else if (grade > 0) {
            result = "F";
        } else {
            result = "Wrong grade!";
        }

        System.out.println(result);
    }

}
