package com.gem.menadzerzadan.service;

import com.gem.menadzerzadan.model.Task;
import com.gem.menadzerzadan.model.User;
import com.gem.menadzerzadan.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService
{
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository)
    {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasksForUser(User user)
    {
        return taskRepository.findByUser(user);
    }

    public Task addTask(Task task, User user)
    {
        task.setUser(user);
        return taskRepository.save(task);
    }
    public void deleteTask(int taskId, User user)
    {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new IllegalArgumentException("Task not found"));

        if(!task.getUser().getUsername().equals(user.getUsername()))
            throw new IllegalArgumentException("You can only delete your own tasks");

        taskRepository.delete(task);
    }

}
