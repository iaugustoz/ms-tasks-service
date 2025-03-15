package com.iaugusto.service.tasks.service;

import com.iaugusto.service.tasks.client.NotificationClient;
import com.iaugusto.service.tasks.model.dto.NotificationDTO;
import com.iaugusto.service.tasks.model.entities.TasksEntity;
import com.iaugusto.service.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private NotificationClient notificationClient;

    public void setNotificationForDueTaks() {
        LocalDateTime deadline = LocalDateTime.now().plusDays(1);
        List<TasksEntity> tasks = taskRepository.findTasksDueWithinDeadline(deadline);

        for (TasksEntity task : tasks) {
            String message = "Sua tarefa " + task.getTitle() + " está prestes a vencer";

            NotificationDTO request = new NotificationDTO(message, task.getEmail());
            notificationClient.sendNotification(request);
            task.setNotified(true);
            taskRepository.save(task);
        }
    }
}
