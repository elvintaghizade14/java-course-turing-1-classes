package az.edu.turing.module01.lesson12;

import java.util.Scanner;

public class StringReverseApp {

    public static void main(String[] args) {
        // input
        final Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();

        // process
        final String reversed =
//                reverseV1(line);
                reverseV2(line);

        // output
        System.out.println(reversed);
    }

    private static String reverseV1(String line) {
        char[] reversedArray = new char[line.length()];

        int lastIndex = line.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            reversedArray[lastIndex - i] = line.charAt(i);
        }

        return new String(reversedArray);
    }

    private static String reverseV2(String line) {
        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            // reversed += line.charAt(i);
            reversed = reversed.concat(String.valueOf(line.charAt(i)));
        }
        return reversed;
    }

    private static String reverseV3(String line) {
        StringBuilder reversed = new StringBuilder();
        // StringBuffer reversed = new StringBuffer();
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed.append(line.charAt(i));
        }
        return reversed.toString();
    }

}
