package az.edu.turing.springboot01.controller;

import az.edu.turing.springboot01.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(21, "Vsl"),
                new Student(19, "Hybt"),
                new Student(23, "Knn"),
                new Student(23, "ILHAM M.")
        );
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        System.err.println(student);
        return student;
    }
}
