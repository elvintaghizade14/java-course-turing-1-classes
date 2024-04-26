package az.edu.turing.module02.part02.lesson11.dao.impl;

import az.edu.turing.module02.part02.lesson11.dao.StudentDao;
import az.edu.turing.module02.part02.lesson11.dao.StudentEntity;

import java.util.HashSet;
import java.util.Set;

public class StudentInMemoryDao extends StudentDao {

    private static final Set<StudentEntity> STUDENT_ENTITIES = new HashSet<>();

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        System.out.println(STUDENT_ENTITIES);
        STUDENT_ENTITIES.add(studentEntity);
        System.out.println(STUDENT_ENTITIES);
        return studentEntity;
    }
}
