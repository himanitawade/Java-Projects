package com.himani.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.himani.student.dal.entities.Student;
import com.himani.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repo;

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Server");
		student.setFee(40d);

		repo.save(student);

	}

	@Test
	void testFindStudentById() {
		Student student = repo.findById(1L).get();
		System.out.print(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1L).get();
		student.setFee(50d);
		repo.save(student);
	}
	
	@Test
	void testdeleteStudent() {
		Student student = repo.findById(1L).get();
		repo.delete(student);
	}
}
