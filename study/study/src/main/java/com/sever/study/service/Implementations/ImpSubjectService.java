/**
 * Gerald Maduabuchi
 * Subject Implementations
 */

// Package.
package com.sever.study.service.Implementations;

// Import Java Utilities
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.sever.study.model.Subject;
import com.sever.study.repository.StudentRepository;
import com.sever.study.repository.SubjectRepository;
import com.sever.study.repository.TeacherRepository;
// Import SubjectService.
import com.sever.study.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpSubjectService implements SubjectService {

    @Autowired
    private SubjectRepository repository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Subject includeSubject(Subject subject) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Subject> getAllSubjects() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Subject> getSubjectById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Subject> findAllSubjectById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Subject updateSubjectById(Long id, Subject subject) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Subject deleteSubjectById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
