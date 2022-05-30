/**
 * Gerald Maduabuchi
 * Student Repository
 */
package com.scholar.server.repository;

import com.scholar.server.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteStudentById(Long id);

    Student findStudentById(Long id);

}
