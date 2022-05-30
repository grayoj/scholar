/**
 * Gerald Maduabuchi
 * Student Repository
 */
package com.scholar.server.repository;

import java.util.Optional;

import com.scholar.server.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteStudentById(Long id);

    Optional<Student> findStudentById(Long id);

}
