package az.edu.turing.module02.lesson05;

import java.util.Arrays;

public class StudentSelectionApp {

    public static void main(String[] args) {
        // input
        String[] students = populate();
        int[] seats = new int[17];

        // process
        int size = students.length;
        for (int i = 0; i < size; i++) {
            // todo: solve the problem!
        }

        // output
        print(students, seats);
    }

    private static String[] populate() {
        return new String[]{
                "Aybəniz",
                "Aydan",
                "Bəhruz",
                "Bəşir",
                "Eldar",
                "Fərid.H",
                "Fərid.K",
                "Kənan",
                "Leyla",
                "Nurlan",
                "Nəzrin",
                "Selen",
                "Taleh",
                "Vüsal",
                "İlham",
                "İsmayıl",
                "Əli"
        };
    }

    private static void print(String[] students, int[] seats) {
        System.out.println(Arrays.toString(seats));

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s \t-->\t %d\n", students[i], seats[i]);
        }
    }
}
