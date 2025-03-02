package com.iaugusto.service.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskNotificationSchedule {

    @Autowired
    private TaskService taskService;

    @Scheduled(fixedRate = 360000 * 24)
    public void checkAndNotifyTasks() {
        this.taskService.setNotificationForDueTaks();
    }
}
