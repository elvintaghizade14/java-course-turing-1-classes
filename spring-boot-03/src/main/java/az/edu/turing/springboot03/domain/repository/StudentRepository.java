package az.edu.turing.springboot03.domain.repository;

import az.edu.turing.springboot03.domain.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    StudentEntity save(StudentEntity student);

    List<StudentEntity> findAll();

    Optional<StudentEntity> findById(Long id);

    void deleteById(Long id);
}
