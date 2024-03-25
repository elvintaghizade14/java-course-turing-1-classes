package az.edu.turing.module02.part01.lesson10;

import java.util.Arrays;
import java.util.Objects;

public final class Student {

    private final int age;
    private final String name;
    private final double[] grades;

    public Student(int age, String name, double[] grades) {
        this.age = age;
        this.name = name;
        this.grades = grades;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        final double[] copiedGrades = new double[grades.length];
        System.arraycopy(grades, 0, copiedGrades, 0, grades.length);
        return copiedGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(age, name);
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Student{age=%d, name='%s', grades=%s}",
                age, name, Arrays.toString(grades));
    }
}
