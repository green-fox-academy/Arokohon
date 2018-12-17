package com.greenfox.listing_todos_with_h2.repository;

import com.greenfox.listing_todos_with_h2.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ToDoRepo extends CrudRepository<ToDo, Integer> {
}
