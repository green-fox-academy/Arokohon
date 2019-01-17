package com.greenfox.practice3.controllers;

import com.greenfox.practice3.models.PizzaOrder;
import com.greenfox.practice3.servicies.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaOrderController {

  private PizzaOrderService service;

  @Autowired
  public PizzaOrderController(PizzaOrderService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("pizzaOrder", new PizzaOrder());
    return "index";
  }

  @PostMapping("/order")
  public String addPizzaOrder(PizzaOrder pizzaOrder) {
    service.addPizzaOrder(pizzaOrder);
    return "redirect:/";
  }

  @GetMapping("/order/{id}")
  public String showPizzaOrder(@PathVariable("id") Long id, Model model) {
    model.addAttribute("pizzaOrder", service.findPizzaOrderById(id));
    return "search";
  }
}
