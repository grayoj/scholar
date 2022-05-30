/**
 * Gerald Maduabuchi
 * Student Service
 */
package com.scholar.server.service;

import java.util.UUID;

import com.scholar.server.model.Student;
import com.scholar.server.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Add Student
    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepository.save(student);      
    }
}
