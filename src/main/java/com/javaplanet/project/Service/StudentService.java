package com.javaplanet.project.Service;

import com.javaplanet.project.entity.Student;

import java.util.List;

public interface StudentService {
    Integer saveStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(Integer sno);
    void deleteStudent(Integer sno);

}
