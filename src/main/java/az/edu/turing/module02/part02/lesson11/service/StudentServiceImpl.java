package az.edu.turing.module02.part02.lesson11.service;

import az.edu.turing.module02.part02.lesson11.dao.StudentDao;
import az.edu.turing.module02.part02.lesson11.dao.StudentEntity;
import az.edu.turing.module02.part02.lesson11.model.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        // todo check pin duplication
        StudentEntity studentEntity = new StudentEntity(
                studentDto.pin,
                studentDto.password,
                studentDto.grade,
                studentDto.age,
                (int) (Math.random() * 1000000)
        );
        StudentEntity savedEntity = studentDao.save(studentEntity);
        return new StudentDto(
                savedEntity.pin,
                savedEntity.password,
                savedEntity.grade,
                savedEntity.age,
                savedEntity.studentId
        );
    }
}
