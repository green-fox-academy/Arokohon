package com.greenfox.connectionwithmysql.services;

import com.greenfox.connectionwithmysql.models.ToDo;
import com.greenfox.connectionwithmysql.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  ToDoRepo toDoRepo;

  @Autowired
  public TodoService(ToDoRepo toDoRepo) {
    this.toDoRepo = toDoRepo;
  }

  public List<ToDo> getToDos() {
    List<ToDo> todos = new ArrayList<>();
    toDoRepo.findAll().forEach(todos::add);
    return todos;
  }

  public List<ToDo> getActiveToDos() {
    List<ToDo> activeTodos = new ArrayList<>();
    toDoRepo.findAll().forEach((toDo) -> {
      if (!toDo.isDone()) {
        activeTodos.add(toDo);
      }
    });
    return activeTodos;
  }

  public void addNewTodo(ToDo todo) {
    this.toDoRepo.save(todo);
  }
}
