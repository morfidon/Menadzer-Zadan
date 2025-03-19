package com.gem.menadzerzadan.repository;

import com.gem.menadzerzadan.model.Task;
import com.gem.menadzerzadan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer>
{
    List<Task> findByUser(User user);//pobierz zadania danego użytkownika
}
