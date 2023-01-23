import { Component, OnInit } from '@angular/core';
import { Jobs } from './jobs';
import { JobsService } from './jobs.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-jobs-list',
  templateUrl: './jobs-list.component.html',
  styleUrls: ['./jobs-list.component.css']
})
export class JobsListComponent implements OnInit{
 


  jobs: Jobs[];
  constructor(private jobservice: JobsService,
    private router: Router 
    ){

  }
  ngOnInit(): void {
   this.getJob();
   }


   private getJob(){
    this.jobservice.getJobsList().subscribe(data =>
      {
        this.jobs = data;
      })
   }
   updateJob(id: number){
    this.router.navigate(['update-jobs',id]);

   }
   deleteJob(id: number)
   {
    this.jobservice.deletejob(id).subscribe(data =>
      {
        console.log(data);
        this.getJob();
      })

   }


}