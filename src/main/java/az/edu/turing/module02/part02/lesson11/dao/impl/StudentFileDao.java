package az.edu.turing.module02.part02.lesson11.dao.impl;

import az.edu.turing.module02.part02.lesson11.dao.StudentDao;
import az.edu.turing.module02.part02.lesson11.dao.StudentEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentFileDao extends StudentDao {

    private static final String RESOURCE_PATH = "src/main/java/az/edu/turing/module02/part02/lesson11/resource/";
    private static final String STUDENTS_FILE_PATH = RESOURCE_PATH.concat("students.txt");
    private final ObjectMapper objectMapper;

    public StudentFileDao(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        try {
            final Path path = Paths.get(STUDENTS_FILE_PATH);
            Files.write(path, objectMapper.writeValueAsBytes(studentEntity));
        } catch (IOException e) {
            System.err.println("Error writing students to file");
            e.printStackTrace();
        }
        return studentEntity;
    }
}
