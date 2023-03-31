package com.javaplanet.project.Repo;

import com.javaplanet.project.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
