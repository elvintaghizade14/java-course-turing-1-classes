package az.edu.turing.module02.part02.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;

public class ArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        nums.add(6);
        System.out.println(nums);
        System.out.println(nums.get(3));

        nums.remove(1);
        System.out.println(nums);

        nums.remove(Integer.valueOf(4));
        System.out.println(nums);
//        nums.remove(11);
//        System.out.println(nums);

        HashSet<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(12);
        integers.add(14);
        integers.add(16);
        integers.add(18);
        integers.add(20);
        integers.add(20);
        integers.add(20);
        System.out.println(integers);

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Doe");
        students.put(3, "Mike");
        System.out.println(students);

        var arrayLists = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for (Integer num : nums) {
            System.out.println(num);
        }

        nums.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        nums.forEach(integer -> System.out.println(integer));

        nums.forEach(System.out::println);
    }
}
