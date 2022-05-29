/**
 * Gerald Maduabuchi
 * Student controller
 */
package com.sever.study.controller;

import com.sever.study.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    
}
