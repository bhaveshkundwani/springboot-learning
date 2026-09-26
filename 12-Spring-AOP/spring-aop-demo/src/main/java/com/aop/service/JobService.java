package com.aop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aop.model.JobPost;
import com.aop.repository.JobRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobService {

	private final JobRepository jobRepository;
	
	public void addJob(JobPost jobPost) {
		jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobRepository.getAllJobs();
    }

	public JobPost getJob(int postId) {
		// int num = 10 / 0;
		return jobRepository.getJob(postId);
	}

	public void updateJob(JobPost jobPost) {
		jobRepository.updateJob(jobPost);
	}

	public void deleteJob(int postId) {
		jobRepository.deleteJob(postId);
	}
    
}
