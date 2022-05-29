/**
 * Gerald Maduabuchi
 */

// Import Package
package com.sever.study.service;

import java.util.List;
import java.util.Optional;

// Import Teacher Model
import com.sever.study.model.Teacher;

// Teacher Service API.

public interface TeacherService {
    // Function to include all teachers.
    Teacher includeTeacher(Teacher teacher);

    // List and Fetch Teachers by ID.
    List<Teacher> findAllTeachers();
    Optional<Teacher> findTeacherById(Long id);

    // Update Teacher by id
    Teacher updateTeacherById(Long id, Teacher teacher);

    // Delete Teacher by id
    Teacher deleteTeacherById(Long id);    
}
