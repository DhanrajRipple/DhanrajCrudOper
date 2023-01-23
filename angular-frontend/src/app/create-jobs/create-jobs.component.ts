import { Component, OnInit } from '@angular/core';
import { Jobs } from '../jobs-list/jobs';
import { JobsService } from '../jobs-list/jobs.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-jobs',
  templateUrl: './create-jobs.component.html',
  styleUrls: ['./create-jobs.component.css']
})
export class CreateJobsComponent implements OnInit{
 

  jobs: Jobs = new Jobs();
  constructor(private jobsservice: JobsService,
    private router: Router
    )
  {

  }

  saveJobs()
  {
    this.jobsservice.createJobs(this.jobs).subscribe(data =>
      {
        console.log(data);
        this.goTojoblist();
      },
      error=> console.log(error)
      );
  }


  goTojoblist()
  {
    this.router.navigate(['/jobs']);

  }

  ngOnInit(): void {
    
  }

  onSubmit(){
    console.log (this.jobs);
    this.saveJobs();
    
  }

}
