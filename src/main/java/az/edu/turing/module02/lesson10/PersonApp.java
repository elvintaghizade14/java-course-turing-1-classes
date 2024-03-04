package az.edu.turing.module02.lesson10;

import java.time.LocalDate;

public class PersonApp {

    public static void main(String[] args) {
        Teacher elvinTeacher = new Teacher("Elvin", LocalDate.of(1990, 1, 1));
        elvinTeacher.happyBirthDate();

        Teacher osmanTeacher = new Teacher("Osman", LocalDate.of(2024, 3, 4));
        osmanTeacher.happyBirthDate();
    }
}
