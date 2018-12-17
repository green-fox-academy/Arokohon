package com.greenfox.listing_todos_with_h2.controllers;

import com.greenfox.listing_todos_with_h2.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  ToDoRepo todorepo;

  @Autowired
  public TodoController(ToDoRepo todorepo) {
    this.todorepo = todorepo;
  }

  @GetMapping(value = "/list")
  public String list(Model model) {
    return "todolist";
  }

  @GetMapping(value = "/findall")
  public String findAll(Model model) {
    model.addAttribute("todos", todorepo.findAll());
    return "todolist";
  }
}
