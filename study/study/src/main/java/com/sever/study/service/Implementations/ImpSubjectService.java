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

import com.sever.study.model.Student;
import com.sever.study.model.Subject;
import com.sever.study.model.Teacher;
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
        return repository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Optional<Subject> getSubjectById(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id);
    }

    @Override
    public Subject updateSubjectById(Long id, Subject subject) {
        // TODO Auto-generated method stub
        Subject updatedSubject = repository.findById(id).get();
        updatedSubject.setName(subject.getName());
        updatedSubject.setStudents(subject.getStudents());
        updatedSubject.setTeacher(subject.getTeacher());
        return repository.save(updatedSubject);
    }

    @Override
    public Subject deleteSubjectById(Long id) {
        // TODO Auto-generated method stub
        Subject deletedSubject = repository.findById(id).get();
        repository.delete(deletedSubject);
        return deletedSubject;
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.getByEmail(email).get();
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).get();
    }

    public Subject enrollStudent(Long id, String studentEmail) {
        Subject subjectToUpdate = repository.getReferenceById(id);
        Student studentToUpdate = studentRepository.getByEmail(studentEmail).get();
        studentToUpdate.getSubjects().add(subjectToUpdate);
        subjectToUpdate.getStudents().add(studentToUpdate);
        return repository.save(subjectToUpdate);
    }

    public List<Student> getStudentsToEnroll(Long id) {
        Subject subject = repository.findById(id).get();
        List<Student> studentsToEnroll = studentRepository.findAll()
                .stream()
                .filter(student -> !subject.getStudents().contains(student))
                .toList();

        return studentsToEnroll;
    }
}
