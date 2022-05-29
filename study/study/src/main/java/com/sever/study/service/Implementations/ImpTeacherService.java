/**
 * Gerald Maduabuchi
 * Teacher Service Implementation
 */

// Include Service Package
package com.sever.study.service.Implementations;

// Import Utilities
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.sever.study.model.Subject;
// Import Model
import com.sever.study.model.Teacher;
import com.sever.study.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
// Implement Service Function
public class ImpTeacherService implements TeacherService {

    // inject the object dependency implicitly
    @Autowired

    @Override
    public Teacher includeTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        return repository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        // TODO Auto-generated method stub
        return repository.getAll();
    }

    @Override
    public Optional<Teacher> getTeacherById(Long id) {
        // TODO Auto-generated method stub
        return repository.getById(id);
    }

    // Update Teacher Method.
    @Override
    public Teacher updateTeacherById(Long id, Teacher teacher) {
        // TODO Auto-generated method stub
        Teacher updatedTeacher = repository.getById(id).get();
        updatedTeacher.setFirstName(teacher.getFirstName());
        updatedTeacher.setLastName(teacher.getLastName());
        updatedTeacher.setEmail(teacher.getEmail());
        return repository.save(updatedTeacher);
    }

    @Override
    public Teacher EditTeacherById(Long id, Teacher teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Teacher deleteTeacherById(Long id) {
        // TODO Auto-generated method stub
        Teacher deletedTeacher = repository.getById(id).get();
        for(Subject s: deletedTeacher.getSubjects()) {
            s.setTeacher(null);
        }
        repository.delete(deletedTeacher);
        return deletedTeacher;
    }
    
}
