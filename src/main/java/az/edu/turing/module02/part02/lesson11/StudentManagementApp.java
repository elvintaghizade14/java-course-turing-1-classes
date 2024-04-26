package az.edu.turing.module02.part02.lesson11;

import az.edu.turing.module02.part02.lesson11.controller.StudentController;
import az.edu.turing.module02.part02.lesson11.dao.StudentDao;
import az.edu.turing.module02.part02.lesson11.dao.impl.StudentFileDao;
import az.edu.turing.module02.part02.lesson11.dao.impl.StudentInMemoryDao;
import az.edu.turing.module02.part02.lesson11.dao.impl.StudentPostgresDao;
import az.edu.turing.module02.part02.lesson11.model.dto.StudentDto;
import az.edu.turing.module02.part02.lesson11.service.StudentService;
import az.edu.turing.module02.part02.lesson11.service.StudentServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentManagementApp {

    public static void main(String[] args) {
        StudentDao studentDao =
                new StudentPostgresDao();
//                new StudentFileDao(new ObjectMapper());
//                new StudentInMemoryDao();
        StudentService studentService =
                new StudentServiceImpl(studentDao);
//                new StudentServiceImplV2(studentDao);

        StudentController studentController = new StudentController(studentService);


        StudentDto createdStudent = studentController.createStudent(new StudentDto(
                "ABC1234", "admin123", 0.0, 16
        ));
        System.out.println(createdStudent);
    }
}
