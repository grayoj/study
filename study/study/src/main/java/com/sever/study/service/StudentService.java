/**
 * Gerald Maduabuchi
 */

// Import Package
package com.sever.study.service;

// Import Java Utilities.
import java.util.List;
import java.util.Optional;

// Include Student Model.
import com.sever.study.model.Student;

public interface StudentService {
    Student includeStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    
}
