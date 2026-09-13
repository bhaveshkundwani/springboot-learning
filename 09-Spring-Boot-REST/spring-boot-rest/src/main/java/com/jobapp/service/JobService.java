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

	public JobPost getJob(int postId) {
		return repo.getJob(postId);
	}

	public void updateJob(JobPost jobPost) {
		repo.updateJob(jobPost);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
	}
    
}
