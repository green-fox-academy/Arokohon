package com.greenfox.connectionwithmysql.controllers;

import com.greenfox.connectionwithmysql.models.ToDo;
import com.greenfox.connectionwithmysql.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  public static ToDoRepo todorepo;

  @Autowired
  public TodoController(ToDoRepo todorepo) {
    this.todorepo = todorepo;
  }

  @GetMapping(value = "/list")
  public String list(Model model) {
    return "todolist";
  }

  @GetMapping(value = "/findall")

  public String findAll(Model model, @RequestParam boolean isActive) {
    List<ToDo> todos = new ArrayList<>();
    if (isActive) {
      todorepo.findAll().forEach(todo -> {
        if(!todo.isDone()) {
          todos.add(todo);
        }
      });
    } else {
      todorepo.findAll().forEach(todos :: add);
    }
    model.addAttribute("todolist", todos);
    return "todolist";
  }


}
