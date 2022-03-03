package com.himani.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.himani.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
