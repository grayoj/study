/**
 * Gerald Maduabuchi
 * Student Service Implementation
 */

// Package
package com.sever.study.service.Implementations;

// Import from Jave Utilities
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

// Import Study Model
import com.sever.study.model.Student;
import com.sever.study.repository.StudentRepository;
import com.sever.study.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Instantiate method
@Service
@Transactional
public class ImpStudentService implements StudentService {

    // Call @Autowired to inject object dependency implicitly.
    @Autowired
    private StudentRepository repository;


    @Override
    public Student includeStudent(Student student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student updateSubjectById(Long id, Student student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student deleteStudentById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
