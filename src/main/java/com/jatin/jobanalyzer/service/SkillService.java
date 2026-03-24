package com.jatin.jobanalyzer.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SkillService {

    private final List<String> skillsList = Arrays.asList(
            "java", "python", "react", "sql", "aws", "azure", "spring", "docker","FastApi"
    );

    public List<String> extractSkills(String text) {
        List<String> foundSkills = new ArrayList<>();
        String lowerText = text.toLowerCase();

        for (String skill : skillsList) {
            if (lowerText.contains(skill)) {
                foundSkills.add(skill);
            }
        }

        return foundSkills.stream()
                .map(String::toLowerCase)
                .distinct()
                .toList();
    }
}
