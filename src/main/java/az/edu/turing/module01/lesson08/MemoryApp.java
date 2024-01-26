package az.edu.turing.module01.lesson08;

import java.util.Arrays;

public class MemoryApp {

    public static void main(String[] args) {
        int[] a1 = {1, 2};
        int[] a2 = a1;

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        a1[1] = -10;

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        a1 = null;

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        int[] nums = new int[2];
        System.out.println(Arrays.toString(nums));

        char[] chars = new char[2];
        System.out.println(Arrays.toString(chars));

        boolean[] booleans = new boolean[2];
        System.out.println(Arrays.toString(booleans));

        int[][] twoDimen = new int[2][2];
        System.out.println(Arrays.toString(twoDimen));

        Object[] objects = new Object[5];
        System.out.println(Arrays.toString(objects));

        String[] strings = new String[3];
        System.out.println(Arrays.toString(strings));

        char[] chars2 = {'E', 'L', 'V', 'I', 'N'};
        System.out.println(chars2);
    }

}
