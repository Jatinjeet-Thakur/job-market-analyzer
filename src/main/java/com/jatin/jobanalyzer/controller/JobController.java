package com.jatin.jobanalyzer.controller;

import com.jatin.jobanalyzer.model.Job;
import com.jatin.jobanalyzer.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/jobs")
public class JobController
{

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public Job addJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }

    @GetMapping("/skills/trending")
    public Map<String, Integer> getTrendingSkills() {
        return jobService.getTrendingSkills();
    }

    @GetMapping("/search")
    public List<Job> searchJobs(@RequestParam String skill) {
        return jobService.searchJobsBySkill(skill);
    }

}

