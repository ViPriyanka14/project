package com.javaplanet.project.Service;

import com.javaplanet.project.Repo.StudentRepository;
import com.javaplanet.project.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public abstract class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Integer saveStudent(Student student) {
        return repository.save(student).getSno();
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student getStudentById(Integer sno) {
        return repository.findById(sno).get();
    }

    @Override
    public void deleteStudent(Integer sno) {
         repository.deleteById(sno);

    }
}
