package com.greenfox.connectionwithmysql.controllers;

import com.greenfox.connectionwithmysql.models.ToDo;
import com.greenfox.connectionwithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    model.addAttribute("alltodos", todolist.getToDos());
    return "todolist";
  }

  @GetMapping(value = "/actives")
  public String findActives(Model model) {
    model.addAttribute("alltodos", todolist.getActiveToDos());
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addTodoForm(Model model) {
    model.addAttribute("todo", new ToDo());
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String addTodo(@ModelAttribute ToDo todo) {
    todolist.addNewTodo(todo);
    return "redirect:/todo/";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteToDo(@PathVariable int id) {
    todolist.deleteToDoById(id);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/edit")
  public String editToDoForm(Model model, @PathVariable int id) {
    model.addAttribute("todo", todolist.getToDoById(id));
    return "edittodo";
  }

  @PostMapping(value = "/{id}/edit")
  public String editToDo(@ModelAttribute ToDo toDo) {
    todolist.addNewTodo(toDo);
    return "redirect:/todo/";
  }
}
