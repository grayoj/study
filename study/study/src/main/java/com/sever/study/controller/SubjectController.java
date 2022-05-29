/**
 * Gerald Maduabuchi
 * Subject Controller
 * This Controller, implements the CRUD methods and REST 
 */
package com.sever.study.controller;

import java.util.List;

import com.sever.study.model.Student;
import com.sever.study.model.Subject;
import com.sever.study.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
@CrossOrigin("*")
public class SubjectController {
    @Autowired
    private SubjectService service;

    @PostMapping()
    public Subject includeSubject(@RequestBody Subject subject) {
        return service.includeSubject(subject);
    }

    @GetMapping()
    public List<Subject> getSubjects() {
        return service.getAllSubjects();
    }

    @PutMapping("/{id}")
    public Subject updateSubjectById(@PathVariable Long id, @RequestBody Subject subject) {
        return service.updateSubjectById(id, subject);
    }

    @DeleteMapping("/{id}")
    public Subject deleteSubjectById(@PathVariable Long id) {
        return service.deleteSubjectById(id);
    }

    @GetMapping("/{id}/students")
	public List<Student> getSubjectStudents(@PathVariable Long id) {
		return service.getSubjectById(id).get().getStudents();
	}

    @GetMapping("/{id}/studentsToEnroll")
	public List<Student> getStudentsToEnroll(@PathVariable Long id) {
		return service.getStudentsToEnroll(id);
	}


	

}