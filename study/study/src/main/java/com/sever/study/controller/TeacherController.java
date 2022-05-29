/**
 * Gerald Maduabuchi
 * Teacher Controller
 * 
 */

 // Package
package com.sever.study.controller;

import com.sever.study.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
@CrossOrigin("*")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    
}
