package com.forhad.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forhad.entities.Student;
import com.forhad.repos.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repository;

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student createStudent(@Valid @RequestBody Student student) {
		return repository.save(student);
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> fetchAllStudent() {
		return repository.findAll();
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student singleStudent(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}

	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public Student updateStudent(@Valid @RequestBody Student student) {
		return repository.save(student);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
}
