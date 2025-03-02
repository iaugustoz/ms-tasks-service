package com.iaugusto.service.tasks.repository;

import com.iaugusto.service.tasks.model.entities.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TasksEntity, Long> {
}
