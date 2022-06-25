/**
 * Gerald Maduabuchi
 * Student Service
 */
package com.scholar.server.service;

import java.util.List;
import java.util.UUID;

import com.scholar.server.exception.UserNotFoundException;
import com.scholar.server.model.Student;
import com.scholar.server.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
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

    // Find Student
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    // Update Student
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    // Find Student
    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not found"));
    }

    // Delete Student
    public void deleteStudent(Long id) {
        studentRepository.deleteStudentById(id);
    }
}
