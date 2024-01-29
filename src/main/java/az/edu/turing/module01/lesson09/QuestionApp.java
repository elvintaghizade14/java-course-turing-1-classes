package az.edu.turing.module01.lesson09;

public class QuestionApp {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray[i]) {
                sum += myArray[i];
            } else if (i != myArray[i]) {
                System.out.println(i);
            }
        }

        System.out.println("Sum " + sum);
    }

}
