package com.javamonks.services;

import com.javamonks.domain.Project;
import com.javamonks.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project, String username){


        return projectRepository.save(project);
    }
}
