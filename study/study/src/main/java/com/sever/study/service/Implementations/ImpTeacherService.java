/**
 * Gerald Maduabuchi
 * Teacher Service Implementation
 */
package com.sever.study.service.Implementations;

// Java Service Utilities.
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

// Import Models.
import com.sever.study.model.Student;
import com.sever.study.repository.StudentRepository;
import com.sever.study.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Student Service Implementation

@Service
@Transactional
public class ImpTeacherService implements StudentService {

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
    public Student updateStudentById(Long id, Student student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student deleteStudentById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
