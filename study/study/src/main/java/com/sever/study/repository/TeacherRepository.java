/**
 * Gerald Maduabuchi
 * Teacher repository
 *
 */

 // Package
package com.sever.study.repository;

 // Import Teacher Model
import com.sever.study.model.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Import JpaRepository extension
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    
}
