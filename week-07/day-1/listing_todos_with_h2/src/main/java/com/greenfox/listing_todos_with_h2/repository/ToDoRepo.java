package com.greenfox.listing_todos_with_h2.repository;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Integer> {
}
