package az.edu.turing.module02.part02.lesson08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayLoopApp {

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};

        // indexed iteration
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int result = nums[i] * 3;
                System.out.println(result);
            }
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();

        // enhanced iteration
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        Arrays.stream(nums).forEach(System.out::println);
        int sum = Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .map(num -> num * 3)
                .map(num -> {
                    System.out.print(num + " ");
                    return num;
                })
//                .peek(num -> System.out.print(num + " "))
//                .forEach(System.out::println);
                .sum();
        System.out.println("sum is " + sum);
    }
}
