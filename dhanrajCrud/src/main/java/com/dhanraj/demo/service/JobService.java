package com.dhanraj.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanraj.demo.entity.Jobs;
import com.dhanraj.demo.model.repository.JobRepository;

import java.util.List;
import java.util.Optional;


@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Jobs saveJob(Jobs jobs){
        return jobRepository.save(jobs);
    }

	
	  public List<Jobs> saveJobs(List<Jobs> jobs){ return
	  jobRepository.saveAll(jobs); }
	  
	  public List<Jobs> getJobs(){ return jobRepository.findAll(); }
	  
	  public Jobs getJobsByid(int id){ 
		  Jobs jobs = jobRepository.findById(id).orElse(null);
		  //return jobRepository.findById(id).orElse(null);
		  return jobs;
	  }
	  
	  public String deleteJObs(int id) { jobRepository.deleteById(id); return
	  "Job deleted!!"+id; }
	  
	  public Jobs updateJobs(Jobs jobs) { Jobs existingjob =
	  jobRepository.findById(jobs.getId()).orElse(null);
	  existingjob.setJob_title(jobs.getJob_title());
	  existingjob.setJob_type(jobs.getJob_type());
	  existingjob.setCreatedby(jobs.getCreatedby());
	  existingjob.setStatus(jobs.getStatus());
	  existingjob.setUpdatedby(jobs.getUpdatedby());
	  existingjob.setLocation(jobs.getLocation()); 
	  Jobs job1 =jobRepository.save(existingjob);
	  return job1;
	  }
	  
	 

}
