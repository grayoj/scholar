package model;

/**
 * Gerald Maduabuchi
 * Student Model
 */

// Implement Serialzable to transform Class.
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Lock class to database.
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable =  false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String className;
    private String phone;
    private String imageLoc;
    @Column(nullable =  false, updatable = false)
    private String studentCode;

    public Student() {}

    public Student(String firstName, String lastName, String email, String className, String phone, String imageLoc, String studentCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.className = className;
        this.phone = phone;
        this.imageLoc = imageLoc;
        this.studentCode = studentCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageLoc() {
        return imageLoc;
    }

    public void setImageLoc(String imageLoc) {
        this.imageLoc = imageLoc;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
        "id=" + id +
        ", firstName ='" + firstName + '\'' +
        ", lastName ='" + lastName + '\'' +
        ", email ='" + email + '\'' +
        ", className ='" + className + '\'' +
        ", phone ='" + phone + '\'' +
        ", imageLoc ='" + imageLoc + '\'' +
        '}';
    }
}
