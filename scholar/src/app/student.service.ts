/**
 * Gerald Maduabuchi
 * Student Service.
 */

// Import http client
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

// Import Student module
import { Student } from './student';

// Inject API consumed.
@Injectable({
  providedIn: 'root'
})

export class StudentService {
  private apiServerUrl: string = '';

  constructor(private http: HttpClient) { }

  // Get Student
  public getStudents(): Observable<Student[]> {
    return this.http.get<any>(`${this.apiServerUrl}/student/all`);
  }

  // Add student
  public addStudent(student: Student): Observable<Student> {
    return this.http.post<Student>(`${this.apiServerUrl}/student/add`, student);
  }

  // Update Student
  public updateStudent(student: Student): Observable<Student> {
    return this.http.put<Student>(`${this.apiServerUrl}/student/update`, student);
  }

  // Delete Student
  public deleteStudent(studentId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/student/delete/${studentId}`);
  }
}
