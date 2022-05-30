/**
 * Gerald Maduabuchi
 * Student Resource
 * The API Controller
 */
package com.scholar.server;

import com.scholar.server.service.StudentService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentResource {
    private final StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
        
    }
}
