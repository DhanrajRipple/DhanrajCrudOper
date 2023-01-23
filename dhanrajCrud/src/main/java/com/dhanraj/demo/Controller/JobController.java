package com.dhanraj.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhanraj.demo.entity.Jobs;
import com.dhanraj.demo.model.repository.JobRepository;
import com.dhanraj.demo.service.JobService;

@Controller
public class JobController {
	
	
	@Autowired
	JobService jobService;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";	
	}
	
	 //@RequestMapping(value = "/addjob", method = RequestMethod.POST)
	@PostMapping("/addjob")
	public String addjob(Jobs job)
	{
		jobService.saveJob(job);
		return "home.jsp";
	}
	
	@GetMapping("/getjob")
	public ModelAndView getjob(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("show.jsp");
		Jobs jobs =  jobService.getJobsByid(id);
		mv.addObject(jobs);
		
		return mv;
	}
	
	@GetMapping("/getjob/{id}")
    public Jobs findJobByid(@PathVariable int id)
    {
        return jobService.getJobsByid(id);
    }

		
	@RequestMapping("/job")
	@ResponseBody
	public String getjobs()
	{
		return jobService.getJobs().toString();
	}
	
	@RequestMapping("/deljob")
	public ModelAndView deljob(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("Del.jsp");
		String del = jobService.deleteJObs(id);
		mv.addObject("del", del);
		return mv;
	}
	
	@RequestMapping("/updatejob")
	public ModelAndView updateByid(Jobs jobs)
	{
		ModelAndView mv = new ModelAndView("Update.jsp");
		Jobs job = jobService.updateJobs(jobs);
		mv.addObject("job1", job);
		return mv;
	}

}
