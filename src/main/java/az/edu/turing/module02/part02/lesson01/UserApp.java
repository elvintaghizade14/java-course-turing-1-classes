package az.edu.turing.module02.part02.lesson01;

import java.util.Scanner;

public class UserApp {
    public static final String[] USERS = {
            "Elvin1", "Elvin2", "Elvin3", "Elvin4", "Elvin5"
    };

    public static void main(String[] args) {
        String username = new Scanner(System.in).nextLine();
        try {
        findByUsernameOrElseThrow(username);
        } catch (UserNotFoundException e) {
            System.out.println("Istifadeci tapilmadi!");
        } catch (IllegalArgumentException e) {
            System.out.println("Daxil etdiyiniz melumatlar yanlishdir!");
        }
    }

    /**
     * @param username String username
     * @throws IllegalArgumentException when user with username not found!
     */
    private static void findByUsernameOrElseThrow(String username)
            throws UserNotFoundException, IllegalArgumentException {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username is invalid:" + username);
        }

        boolean isFound = false;
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i].equals(username)) {
                isFound = true;
            }
        }
        if (!isFound) {
            throw new UserNotFoundException("User " + username + " not found!");
        }
    }
}
