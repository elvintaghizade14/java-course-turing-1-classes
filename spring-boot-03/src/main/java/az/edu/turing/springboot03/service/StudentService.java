package az.edu.turing.springboot03.service;

import az.edu.turing.springboot03.domain.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity save(StudentEntity student);

    List<StudentEntity> findAll();

    StudentEntity findById(Long id);

    void deleteById(Long id);
}
