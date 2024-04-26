package az.edu.turing.module02.part02.lesson11.model.dto;

public class StudentDto {

    public final String pin;
    public final String password;
    public final Double grade;
    public final int age;
    public int studentId;

    public StudentDto(String pin, String password, Double grade, int age) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
    }

    public StudentDto(String pin, String password, Double grade, int age, int studentId) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("{pin='%s', password='%s', grade=%s, age=%d, studentId=%d}", pin, password, grade, age, studentId);
    }
}
