package com.iaugusto.service.tasks.repository;

import com.iaugusto.service.tasks.model.entities.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<TasksEntity, Long> {

    @Query("""
            SELECT t FROM Task t
            WHERE t.dueDate <= :deadline
            AND t.notified = false
            """)
    List<TasksEntity> findTasksDueWithinDeadline(LocalDateTime deadline);
}
