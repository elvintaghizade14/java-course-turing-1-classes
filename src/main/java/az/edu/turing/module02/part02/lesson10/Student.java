package az.edu.turing.module02.part02.lesson10;

import java.io.Serializable;
import java.util.Objects;

public final class Student implements Serializable {

    private static final long serialVersionUID = -1123791283042L;

    private static long MAX_INDEX = 0;
    /*transient*/ public double id;
    public int age;
    public String name;
    public double grade;

    public Student() {
    }

    Student(int age, String name, double grade) {
        this.id = ++MAX_INDEX;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    Student(long id, int age, String name, double grade) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name, grade);
    }

    @Override
    public String toString() {
        return String.format("{id=%s, age=%d, name='%s', grade=%s}", id, age, name, grade);
    }

    public String represent() {
        return String.format("%d,%d,%s,%s", id, age, name, grade);
    }
}


