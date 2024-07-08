package az.edu.turing.springboot03.service.impl;

import az.edu.turing.springboot03.domain.entity.StudentEntity;
import az.edu.turing.springboot03.domain.repository.StudentRepository;
import az.edu.turing.springboot03.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentEntity student) {
        throw new IllegalStateException("not implemented yet...");
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

    }
}
