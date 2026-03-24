package com.jatin.jobanalyzer.repository;

import com.jatin.jobanalyzer.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByDescriptionContainingIgnoreCase(String keyword);
}

