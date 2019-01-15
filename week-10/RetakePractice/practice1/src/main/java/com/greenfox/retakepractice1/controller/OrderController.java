package com.greenfox.retakepractice1.controller;

import com.greenfox.retakepractice1.model.FoodOrder;
import com.greenfox.retakepractice1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OrderController {

  private OrderService service;

  @Autowired
  public OrderController(OrderService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("foodOrder", new FoodOrder());
    return "index";
  }

  @PostMapping("/order")
  public String addOrder(FoodOrder foodOrder, RedirectAttributes redir) {
    service.addOrder(foodOrder);
    redir.addAttribute("id", foodOrder.getId());
    return "redirect:/order/{id}";
  }

  @GetMapping("/order/{id}")
  public String showNewOrder(@PathVariable("id") Long id, Model model) {
    if (service.existsById(id)) {
      model.addAttribute("foodOrder", service.getOrderById(id));
      return "order-accepted";
    } else {
      model.addAttribute("error", "Order on id: " + id + " does not exist.");
      return "error";
    }
  }
}
