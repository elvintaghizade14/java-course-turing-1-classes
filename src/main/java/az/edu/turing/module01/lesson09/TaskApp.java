package az.edu.turing.module01.lesson09;

public class TaskApp {

    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < 3; i++) {
            for (int arrIndex = 0; arrIndex < 4; arrIndex++) {
                arr[arrIndex] = (int) (Math.random() * 100);
            }
            printArray(arr);
        }
    }

    public static void printArray(int[] nums) {
        System.out.println("=======");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " -> " + nums[i]);
        }
    }

}
