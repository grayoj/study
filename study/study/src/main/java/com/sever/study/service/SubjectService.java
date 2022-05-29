/**
 * Gerald Maduabuchi
 * Subject Model
 */

// Include Service Package
package com.sever.study.service;

import java.util.List;
import java.util.Optional;

import com.sever.study.model.Student;
// Import Subject from Model
import com.sever.study.model.Subject;

// Create Public Interface and assign subject service to be implemented.
public interface SubjectService {
    Subject includeSubject(Subject subject);
    List<Subject> getAllSubjects();
    Optional<Subject> getSubjectById(Long id);
    Subject updateSubjectById(Long id, Subject subject);
    Subject deleteSubjectById(Long id);
    Subject enrollStudent(Long id, String studentEmail);
    List<Student> getStudentsToEnroll(Long id);

}
