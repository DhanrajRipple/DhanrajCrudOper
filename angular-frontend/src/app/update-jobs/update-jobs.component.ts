import { Component, OnInit } from '@angular/core';
import { Jobs } from '../jobs-list/jobs';
import { JobsService } from '../jobs-list/jobs.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-jobs',
  templateUrl: './update-jobs.component.html',
  styleUrls: ['./update-jobs.component.css']
})
export class UpdateJobsComponent implements OnInit {


  id: number;
  jobs: Jobs = new Jobs();

  constructor(private jobservice: JobsService,private route: ActivatedRoute, private router: Router)
  {

  }
  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];
    this.jobservice.getJobById(this.id).subscribe(data=>
      {
        this.jobs = data;

      },
      error=> console.log(error));
  }
 
  onSubmit()
  {
   
    this.jobservice.updateJob(this.id,this.jobs).subscribe(data =>
      {
        this.goTojoblist();


      },error=>console.log(error)
      );
  }
  goTojoblist()
  {
    this.router.navigate(['/jobs']);

  }

}
