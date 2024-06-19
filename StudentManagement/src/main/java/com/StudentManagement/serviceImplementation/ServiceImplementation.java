package com.StudentManagement.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagement.entity.Student;
import com.StudentManagement.service.StudentService;

@Service	
public class ServiceImplementation implements StudentService{

	@Autowired
	com.StudentManagement.repository.StudentRepo StudentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> list=StudentRepo.findAll();
		return list;
	}
	
	@Override
	public Student saveStudent(Student student) {
		return StudentRepo.save(student);
	}

	@Override
	public Student getById(int id) {
		return StudentRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		StudentRepo.deleteById(id);
		
	}
	
	
}
