package az.edu.turing.module02.part02.lesson09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class StudentApp {

    public static final String RESOURCE_FOLDER = "src/main/java/az/edu/turing/module02/part02/lesson09/resource/";
    public static final String STUDENTS_FILE = RESOURCE_FOLDER + "students.txt";
    private static final List<Student> STUDENTS = new ArrayList<>();

    public static void mainV1(String[] args) {
        final Student student = new Student(19, "Beshir", 51);
        System.out.println(STUDENTS);
        System.out.println(addStudent(student));
        System.out.println(STUDENTS);
        final Student student2 = new Student(22, "Vusal", 51);
        System.out.println(addStudent(student2));
        System.out.println(STUDENTS);
    }

    public static void main(String[] args) {
        final Student student = new Student(19, "Beshir", 51);
        System.out.println(addStudentFile(student));
        printAllStudents();

//        final Student student2 = new Student(29, "Eldar", 61);
//        System.out.println(addStudentFile(student2));
//        printAllStudents();

        printAllStudentsIntoObj();
    }

    private static long addStudent(Student student) {
        STUDENTS.add(student);
        return student.id;
    }

    private static long addStudentFile(Student student) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(STUDENTS_FILE, true))) {
//            bw.write(student.toString());
            bw.write(student.represent());
            bw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student.id;
    }


    private static void printAllStudents() {
        try(BufferedReader br = new BufferedReader(new FileReader(STUDENTS_FILE))) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printAllStudentsIntoObj() {
        try(BufferedReader br = new BufferedReader(new FileReader(STUDENTS_FILE))) {
            br.lines().forEach(line -> {
                System.out.println(line);
                String[] obj = line.split(",");
                Student student = new Student(
                        Long.parseLong(obj[0]),
                        Integer.parseInt(obj[1]),
                        obj[2],
                        Double.parseDouble(obj[3])
                );
                System.out.println(student);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static final class Student {
        private static long MAX_INDEX = 0;
        public long id;
        public final int age;
        public final String name;
        public final double grade;

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
            return String.format("{id=%d, age=%d, name='%s', grade=%s}", id, age, name, grade);
        }

        public String represent() {
            return String.format("%d,%d,%s,%s", id, age, name, grade);
        }
    }
}
