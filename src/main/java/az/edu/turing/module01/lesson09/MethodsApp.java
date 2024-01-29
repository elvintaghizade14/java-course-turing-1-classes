package az.edu.turing.module01.lesson09;

import java.util.Arrays;

public class MethodsApp {

    public static void main(String[] args) {
        printNewLine();

        printArrayAsList(new long[]{1, 2, 3, 4, 5});

        double randomNum = generateRandomNum();
        System.out.println(randomNum);

        double result = calcPower(3, 2);
        System.out.println(result);
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printArrayAsList(long[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static double generateRandomNum() {
        return Math.random();
    }

    public static double calcPower(int num, int pow) {
        return Math.pow(num, pow);
    }

}
