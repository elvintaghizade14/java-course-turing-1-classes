package az.edu.turing.module02.lesson10;

import java.time.LocalDate;

public abstract class Person {

    protected final String name;
    protected final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract void happyBirthDate();
}
