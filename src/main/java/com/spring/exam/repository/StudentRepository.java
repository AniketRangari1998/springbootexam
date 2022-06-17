package com.spring.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.exam.entity.StudentClass;

public interface StudentRepository extends JpaRepository<StudentClass, Integer>{

}
