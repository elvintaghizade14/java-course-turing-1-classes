package az.edu.turing.module01.lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationsApp {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int size = scan.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        int sum = 0;
        int prod = 1;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < size; i++) {
            int currentElement = numbers[i];

            sum += currentElement;
            prod *= currentElement;
            if (min > currentElement) min = currentElement;
            if (max < currentElement) {
                max = currentElement;
            }
            System.out.print(currentElement + " ");
        }

        System.out.println();
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println("Sum is: " + sum);
        System.out.println("Prod is: " + prod);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.getClass().getName());
        System.out.println("Turing".getClass().getName());
        System.out.println(new Double(5).getClass().getName());
    }

}
