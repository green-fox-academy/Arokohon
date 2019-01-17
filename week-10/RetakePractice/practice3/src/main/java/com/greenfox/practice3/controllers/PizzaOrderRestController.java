package com.greenfox.practice3.controllers;

import com.greenfox.practice3.models.PizzaOrder;
import com.greenfox.practice3.servicies.PizzaOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaOrderRestController {

  private PizzaOrderServiceImpl service;

  @Autowired
  public PizzaOrderRestController(PizzaOrderServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/api/orders/{id}")
  public ResponseEntity<PizzaOrder> pizzaOrderFinder(@PathVariable("id") Long id) {
    return new ResponseEntity<>(service.findPizzaOrderById(id), HttpStatus.OK);
  }
}
