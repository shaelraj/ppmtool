package com.javamonks.controller;

import com.javamonks.domain.Project;
import com.javamonks.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
@CrossOrigin
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    private ResponseEntity<Project> createNewProject(@RequestBody Project project){
        projectService.saveOrUpdateProject(project, "shael");
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

}
