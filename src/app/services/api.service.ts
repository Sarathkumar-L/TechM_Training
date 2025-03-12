import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
// import { Observable } from 'rxjs';
import { map, Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {


  constructor(private http:HttpClient) { }

  getServices():Observable<any>{
    return this.http.get('http://localhost:4500/services');
  }

  getProjects():Observable<any>{
    return this.http.get('http://localhost:4500/projects');
 }
  addEnquiry(data:any):Observable<any>{
    return this.http.post('http://localhost:4500/enquiries', data);
  }

  getEnquiries():Observable<any>{
    return this.http.get('http://localhost:4500/enquiries');
  }

  getDetails(id:string):Observable<any>{
    return this.http.get(`http://localhost:4500/details?id=${id}`);
  }

  addEnquiryReply(data:any):Observable<any>{
    return this.http.post('http://localhost:4500/enquiryresponses', data);
  }

  addCourse(data: any): Observable<any> {
    return this.http.post('http://localhost:4500/courses', data);
  }

  getCourse(): Observable<any> {
    return this.http.get('http://localhost:4500/courses');
  }
  authenticate(username: string, password: string): Observable<boolean> {
    return this.http.get<any[]>('http://localhost:4500/users').pipe(
      map(users => {
        const user = users.find(u => u.username === username && u.password === password);
        return !!user; // Return true if user is found, otherwise false
      })
    );
  }
  }
  