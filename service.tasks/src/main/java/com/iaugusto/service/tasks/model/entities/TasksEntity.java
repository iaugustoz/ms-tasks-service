package com.iaugusto.service.tasks.model.entities;

import com.iaugusto.service.tasks.model.dto.TasksDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Task")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String type;

    private String email;

    private LocalDateTime dueDate;

    private boolean notified;

    public TasksEntity(TasksDTO dto) {
        this.title = dto.title();
        this.type = dto.type();
        this.email = dto.email();
        this.dueDate = dto.dueDate();
        this.notified = dto.notified();
    }
}
