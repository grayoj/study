/**
 * Gerald Maduabuchi
 * Student controller.
 * This Controller, implements the CRUD methods and REST architecture.
 */
package com.sever.study.controller;

import java.util.List;

import com.sever.study.model.Student;
import com.sever.study.service.StudentService;

// Required Imports.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// Import RestController Extensions.
import org.springframework.web.bind.annotation.RestController;

// Controller Function
@RestController
// End point for Students mapping for API
@CrossOrigin("*")
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentService service;

    @PostMapping()
    public Student includeStudent(@RequestBody Student student) {
        return service.includeStudent(student);
    }

    @GetMapping()
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // GET ID From Endpoint.
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getStudentById(id).get();
    }

    // PUT ID From Endpoint.
    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudentById(id, student);
    }

    // DELETE ID From Endpoint.
    @DeleteMapping("/{id}")
    public Student deleteStudentById(@PathVariable Long id) {
        return service.deleteStudentById(id);
    }
}
