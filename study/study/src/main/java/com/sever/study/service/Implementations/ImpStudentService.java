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

    // Override elements declared in a higher class
    @Override
    public Student includeStudent(Student newStudent) {
        // TODO Auto-generated method stub
        return repository.save(newStudent);
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id);
    }

    @Override
    // Update Function
    public Student updateStudentById(Long id, Student student) {
        // TODO Auto-generated method stub
        Student updatedStudent = repository.findById(id).get();
        updatedStudent.setFirstName(student.getFirstName());
        updatedStudent.setLastName(student.getLastName());
        updatedStudent.setEmail(student.getEmail());
        updatedStudent.setClassName(student.getClassName());
        return repository.save(updatedStudent);
    }

    @Override
    public Student deleteStudentById(Long id) {
        // TODO Auto-generated method stub
        Student deletedStudent = repository.findById(id).get();
        repository.deleteById(id);
        return deletedStudent;
    }

}
