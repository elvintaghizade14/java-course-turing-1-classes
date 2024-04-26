package az.edu.turing.module02.part02.lesson11.controller;

import az.edu.turing.module02.part02.lesson11.exception.StudentException;
import az.edu.turing.module02.part02.lesson11.model.dto.StudentDto;
import az.edu.turing.module02.part02.lesson11.service.StudentService;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentDto createStudent(StudentDto studentDto) {
        final String pin = studentDto.pin;
        if (pin == null || pin.length() != 7) {
            throw new StudentException("Pin is not valid! -> " + pin);
        }
        // todo validate other inputs...
        return studentService.createStudent(studentDto);
    }
}
