package az.edu.turing.module01.lesson08;

public class TwoDimensionalArrayApp {

    public static void main(String[] args) {
        // one-dimensional array:
        int[] x = new int[]{1, 2, 3, 4, 5};
        for (int element : x) {
            System.out.print(element + " ");
        }
        System.out.println("\n---");

        // two-dimensional array:
        int[][] xy = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12},
                {13, 14, 15}
        };
        System.out.println(xy[1][2]);
        System.out.println(xy[0][3]);
        System.out.println(xy.length);
        for (int rowIndex = 0; rowIndex < xy.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < xy[rowIndex].length; columnIndex++) {
                System.out.print(xy[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }


    }

}
