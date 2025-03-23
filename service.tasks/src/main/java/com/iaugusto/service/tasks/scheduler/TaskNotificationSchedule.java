package com.iaugusto.service.tasks.scheduler;

import com.iaugusto.service.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskNotificationSchedule {

    @Autowired
    private TaskService taskService;

    @Scheduled(fixedRate = 60)
    public void checkAndNotifyTasks() {
        this.taskService.setNotificationForDueTaks();
    }
}
