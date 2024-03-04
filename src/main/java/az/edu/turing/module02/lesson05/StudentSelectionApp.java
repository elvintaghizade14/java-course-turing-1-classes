package az.edu.turing.module02.lesson05;

import java.util.Arrays;
import java.util.Random;

public class StudentSelectionApp {

    public static void main(String[] args) {
        //Description
        // I also used Fisher-Yates shuffle algorithm for random seats here

        String[] names = {
                "Ali", "Aybaniz", "Aydan", "Bahruz", "Bashir",
                "Eldar", "Farid H.", "Ferid K.", "Ilham", "Kanan",
                "Nazrin", "Nurlan", "Selen", "Ismayil", "Vusal", "Leyla"
        };

        shuffleSeats(names);
    }

    public static void shuffleSeats(String [] students) {
        Random rnd = new Random();
        for (int i = students.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String temp = students[index];
            students[index] = students[i];
            students[i] = temp;
        }
        printResult(students);
    }

    public static void printResult(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Seat %d\t->\t %s\n", i+1, students[i]);
        }
    }

    public static void main1(String[] args) {
        // input
        String[] students = populate();
        Integer[] seats = new Integer[17];

        // process
        int counter = 0;
        int size = students.length;
        for (int i = 0; i < size; i++) {
            int randomSeat;
            while (counter != 17) {
                randomSeat = new Random().nextInt(size);
                if (seats[randomSeat] == null) {
//                    seats[randomSeat]
                    counter++;
                }
            }
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

    private static void print(String[] students, Integer[] seats) {
        System.out.println(Arrays.toString(seats));

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s \t-->\t %d\n", students[i], seats[i]);
        }
    }
}
