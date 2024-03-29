package az.edu.turing.module02.part02.lesson03;

import java.util.Arrays;

public class SortApp {

    public static void main(String[] args) {
        Integer[] nums = {9, -6, 0, 3, 2};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] names = {"Elvin", "Bahruz", "Bashir", "Osman"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
