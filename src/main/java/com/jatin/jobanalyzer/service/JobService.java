package com.jatin.jobanalyzer.service;

import com.jatin.jobanalyzer.model.Job;
import com.jatin.jobanalyzer.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JobService {

    private final JobRepository jobRepository;
    private final SkillService skillService;

    public JobService(JobRepository jobRepository, SkillService skillService) {
        this.jobRepository = jobRepository;
        this.skillService = skillService;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> searchJobsBySkill(String skill) {
        List<Job> jobs = jobRepository.findAll();
        List<Job> result = new ArrayList<>();

        for (Job job : jobs) {
            List<String> skills = skillService.extractSkills(job.getDescription());

            if (skills.contains(skill.toLowerCase())) {
                result.add(job);
            }
        }

        return result;
    }

    public Map<String, Integer> getTrendingSkills() {
        List<Job> jobs = jobRepository.findAll();
        Map<String, Integer> skillCount = new HashMap<>();

        for (Job job : jobs) {
            List<String> skills = skillService.extractSkills(job.getDescription());

            for (String skill : skills) {
                skillCount.put(skill, skillCount.getOrDefault(skill, 0) + 1);
            }
        }

        return skillCount;
    }
}