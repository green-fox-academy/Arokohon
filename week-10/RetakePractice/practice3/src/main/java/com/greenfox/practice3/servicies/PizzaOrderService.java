package com.greenfox.practice3.servicies;

import com.greenfox.practice3.models.PizzaOrder;

public interface PizzaOrderService {

  void addPizzaOrder(PizzaOrder pizzaOrder);
  PizzaOrder findPizzaOrderById(Long id);
}
