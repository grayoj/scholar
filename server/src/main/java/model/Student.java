/**
 * Gerald Maduabuchi
 * Student Model
 */

// Package
package model;

// Import Serializable
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
// Student Class Function
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = true)
    private Long id;
    private String firstName;
    private String lastName;
    private String className;
    private String phone;
    private String imageLoc;
    private String email;
    private String employeeCode;
}
