package az.edu.turing.module01.lesson06;

import java.util.Scanner;

public class SeasonsApp {

    public static void main(String[] args) {
        // 1. input
        System.out.println("Enter number of month: ");
        int month = new Scanner(System.in).nextInt();

        // 2. process
        String season = month < 1 || month > 12
                ? "Wrong input!" : (month >= 3 && month <= 5)
                ? "Spring" : (month > 5 && month <= 8)
                ? "Summer" : (month > 8 && month <= 11)
                ? "Autumn" : "Winter";


        String result = null;
        if (month < 1 || month > 12) result = "Wrong input!";
        else if (month >= 3 && month <= 5) result = "Spring";
        System.out.println(result);

        // 3. output
        System.out.println(season);
    }

}
