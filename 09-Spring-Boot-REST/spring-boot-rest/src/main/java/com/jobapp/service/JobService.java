package com.jobapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobapp.model.JobPost;
import com.jobapp.repo.JobRepo;

@Service
public class JobService {
	
//	@Autowired
//    private JobRepo repo;

	private final JobRepo repo;

    JobService(JobRepo repo) {
        this.repo = repo;
    }
	
	public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
    
}
