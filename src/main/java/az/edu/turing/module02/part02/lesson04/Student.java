package az.edu.turing.module02.part02.lesson04;

import java.util.Objects;

public final class Student {

    public final int age;
    public final double grade;
    public final String name;

    public Student(int age, double grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{age=%d, grade=%s, name='%s'}", age, grade, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, grade, name);
    }
}
