package az.edu.turing.springboot03.domain.repository;

import az.edu.turing.springboot03.domain.entity.StudentEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    public static List<StudentEntity> STUDENTS;

    @PostConstruct
    public void init() {
        STUDENTS = List.of(
                new StudentEntity(1L, "Selen", 22),
                new StudentEntity(2L, "Vusal", 21),
                new StudentEntity(3L, "Beshir", 18)
        );
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        return null;
    }

    @Override
    public List<StudentEntity> findAll() {
        return STUDENTS;
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return STUDENTS.stream().filter(studentEntity -> studentEntity.getId().equals(id)).findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }
}
