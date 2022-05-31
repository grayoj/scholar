/**
 * Gerald Maduabuchi
 * Student Service.
 */

// Import http client
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import  { Observable } from 'rxjs';

// Inject API consumed.
@Injectable({
  providedIn: 'root'
})

export class StudentService {
  private apiServerUrl: string = '';

  constructor(private http: HttpClient) {}

  public getStudents(): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/student/all`);
  }
}
