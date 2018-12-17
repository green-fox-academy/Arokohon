package com.greenfox.connectionwithmysql.repositories;

import com.greenfox.connectionwithmysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends CrudRepository<ToDo, Integer> {
}
