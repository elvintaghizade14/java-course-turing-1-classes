package az.edu.turing.module01.lesson11;

import java.util.Scanner;

public class StringMethodsApp {

    public static void main(String[] args) {
        // input
        final String email = new Scanner(System.in).next();

        // process
        final String name = extractName(email);
        final long size = getSizeOfName(name);

        // output
        System.out.println(name);
        System.out.println(size);
    }

    private static long getSizeOfName(String name) {
        return name.length();
    }

    private static String extractName(String email) {
        return email.substring(0, email.indexOf('@'));
    }

}
