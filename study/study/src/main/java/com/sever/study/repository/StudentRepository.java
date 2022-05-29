package com.sever.study.repository;

import java.util.Optional;

import com.sever.study.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
    Optional<Student> getByEmail(String email);
}
