package com.jobapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobapp.model.JobPost;
import com.jobapp.service.JobService;

@RestController
public class JobRestController {
	
	private final JobService service;
	
	JobRestController(JobService service) {
		this.service = service;
	}
	
	@GetMapping("jobPosts")
	@ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

}
