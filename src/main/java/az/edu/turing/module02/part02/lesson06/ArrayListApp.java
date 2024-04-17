package az.edu.turing.module02.part02.lesson06;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(9, 100);
        nums.add(3, 10);
        nums.add(1);

        String string = nums.toString();
        System.out.println(nums);
    }
}
