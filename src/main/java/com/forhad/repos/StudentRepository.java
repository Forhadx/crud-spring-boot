package com.forhad.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forhad.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
