package com.greenfox.connectionwithmysql.controllers;

import com.greenfox.connectionwithmysql.models.ToDo;
import com.greenfox.connectionwithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  public static TodoService todolist;

  @Autowired
  public TodoController(TodoService todolist) {
    this.todolist = todolist;
  }

  @GetMapping(value = "/")
  public String list(Model model) {
    return "todolist";
  }

  @GetMapping(value = "/actives")
  public String findActives(Model model) {
    model.addAttribute("alltodos", todolist.getActiveToDos());
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addTodo(Model model) {
    model.addAttribute("todo", new ToDo());
    return "addtodo";
  }
}
