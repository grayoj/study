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
    Teacher includeTeacher(Teacher teacher);
    List<Teacher> findAllTeachers();
    Optional<Teacher> findTeacherById(Long id);
    Teacher updateTeacherById(Long id, Teacher teacher);
    Teacher deleteTeacherById(Long id);    
}
