package az.edu.turing.module02.part02.lesson11.dao;

import java.io.Serializable;
import java.util.Objects;

public final class StudentEntity implements Serializable {

    private static final Long serialVersionUID = 1L;

    public final String pin;
    public final String password;
    public final Double grade;
    public final int age;
    public int studentId;

    public StudentEntity(String pin, String password, Double grade, int age) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
    }

    public StudentEntity(String pin, String password, Double grade, int age, int studentId) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity studentEntity = (StudentEntity) o;
        return studentId == studentEntity.studentId && Objects.equals(pin, studentEntity.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, studentId);
    }

    @Override
    public String toString() {
        return String.format("{pin='%s', password='%s', grade=%s, age=%d, studentId=%d}", pin, password, grade, age, studentId);
    }
}
