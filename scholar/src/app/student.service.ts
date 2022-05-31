/**
 * Gerald Maduabuchi
 * Student Service.
 */

// Import http client
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import  { Observable } from 'rxjs';

// Import Student module
import { Student } from './student';

// Inject API consumed.
@Injectable({
  providedIn: 'root'
})

export class StudentService {
  private apiServerUrl: string = '';

  constructor(private http: HttpClient) {}

  public getStudents(): Observable<Student[]> {
    return this.http.get<any>(`${this.apiServerUrl}/student/all`);
  }

}
