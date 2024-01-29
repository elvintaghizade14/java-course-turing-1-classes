package az.edu.turing.module01.lesson09;

import java.util.Arrays;

public class PassByReferenceApp {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}
