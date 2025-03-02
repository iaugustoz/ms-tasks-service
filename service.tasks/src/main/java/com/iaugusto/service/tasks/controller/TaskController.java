package com.iaugusto.service.tasks.controller;

import com.iaugusto.service.tasks.model.dto.TasksDTO;
import com.iaugusto.service.tasks.model.entities.TasksEntity;
import com.iaugusto.service.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository tasksRepository;

    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody TasksDTO dto) {
        var task = new TasksEntity(dto);
        URI location = URI.create("/tasks/" + task.getId());

        return ResponseEntity.created(location).body(task);
    }

}
