import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobsListComponent } from './jobs-list/jobs-list.component';
import { CreateJobsComponent } from './create-jobs/create-jobs.component';
import { UpdateJobsComponent } from './update-jobs/update-jobs.component';

const routes: Routes = [
  {
    path: 'jobs',component: JobsListComponent
  },
  {
    path: '', redirectTo: 'jobs', pathMatch: 'full'
  },
  {
    path: 'create-jobs',component: CreateJobsComponent
  },
  {
    path: 'update-jobs/:id',component: UpdateJobsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
