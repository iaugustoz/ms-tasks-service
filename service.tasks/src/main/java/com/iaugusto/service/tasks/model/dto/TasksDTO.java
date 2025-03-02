package com.iaugusto.service.tasks.model.dto;

import java.time.LocalDateTime;

public record TasksDTO(String title, String type, LocalDateTime dueDate, boolean notified) {
}
