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
import com.sever.study.model.Teacher;
import com.sever.study.repository.TeacherRepository;
import com.sever.study.service.StudentService;
import com.sever.study.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Student Service Implementation

@Service
@Transactional
public class ImpTeacherService implements TeacherService {

    @Autowired
    private TeacherRepository repository;


    @Override
    public Teacher includeTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        return repository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Teacher> getTeacherById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Teacher updateTeacherById(Long id, Teacher teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Teacher EditTeacherById(Long id, Teacher teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Teacher deleteTeacherById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
