package com.minitest2.repository;

import com.minitest2.model.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepo extends CrudRepository<Task, Long> {
}
