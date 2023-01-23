import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Jobs } from './jobs';

@Injectable({
  providedIn: 'root'
})
export class JobsService {

  private baseURL = "http://localhost:8080/jobs";
  private baseURL1="http://localhost:8080/addjob";
  private baseUrl2="http://localhost:8080/delete";
  constructor(private httpclient: HttpClient) { }

getJobsList():Observable<Jobs[]>
{
  return this.httpclient.get<Jobs[]>(`${this.baseURL}`);
}

createJobs(jobs:Jobs): Observable<Object>
{
  return this.httpclient.post(`${this.baseURL1}`,jobs);
}

getJobById(id: number): Observable<Jobs>
{
  return this.httpclient.get<Jobs>(`${this.baseURL}/${id}`);
}

updateJob(id:number,jobs: Jobs): Observable<Object>
{
  return this.httpclient.put(`${this.baseURL}/${id}`,jobs);
}

deletejob(id:number):Observable<any>
{
  return this.httpclient.delete(`${this.baseURL}/${id}`);
}
}
