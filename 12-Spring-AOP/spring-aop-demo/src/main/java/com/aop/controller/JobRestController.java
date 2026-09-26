package com.aop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aop.model.JobPost;
import com.aop.service.JobService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
	
	private final JobService jobService;
	
	@GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }
	
	@GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return jobService.getJob(postId);
    }
	
	@PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
		jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

	@PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
		jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
    	jobService.deleteJob(postId);
        return "Deleted";
    }

}
