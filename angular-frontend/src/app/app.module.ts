import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { JobsListComponent } from './jobs-list/jobs-list.component';
import { CreateJobsComponent } from './create-jobs/create-jobs.component';
import { FormsModule } from '@angular/forms';
import { UpdateJobsComponent } from './update-jobs/update-jobs.component';

@NgModule({
  declarations: [
    AppComponent,
    JobsListComponent,
    CreateJobsComponent,
    UpdateJobsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
