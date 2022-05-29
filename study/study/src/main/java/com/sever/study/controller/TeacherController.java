/**
 * Gerald Maduabuchi
 * Teacher Controller
 * 
 */

 // Package
package com.sever.study.controller;

import java.util.List;

import com.sever.study.model.Teacher;
import com.sever.study.service.TeacherService;

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
@RequestMapping("/teachers")
@CrossOrigin("*")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    // POST
    @PostMapping()
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherService.includeTeacher(teacher);
	}
	
    // GET
	@GetMapping("")
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}
	
    // GET
	@GetMapping("/{id}")
	public Teacher getTeacherById(@PathVariable Long id) {
		return teacherService.getTeacherById(id).get();
	}
	
    // PUT
	@PutMapping("/{id}")
	public Teacher updateTeacherById(@PathVariable Long id, @RequestBody Teacher teacher) {
		return teacherService.updateTeacherById(id, teacher);
	}
	
    // DELETE
	@DeleteMapping("/{id}")
	public Teacher deleteTeacherById(@PathVariable Long id) {
		return teacherService.deleteTeacherById(id);
	}
}
