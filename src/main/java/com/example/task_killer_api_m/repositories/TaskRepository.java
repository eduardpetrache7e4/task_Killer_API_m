package com.example.task_killer_api_m.repositories;

import com.example.task_killer_api_m.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    Optional<Task> findById(Long id);
}
