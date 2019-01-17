package com.greenfox.practice3.servicies;

import com.greenfox.practice3.models.PizzaOrder;
import com.greenfox.practice3.repositories.PizzaOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaOrderServiceImpl implements PizzaOrderService {

  private PizzaOrderRepository repository;

  @Autowired
  public PizzaOrderServiceImpl(PizzaOrderRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addPizzaOrder(PizzaOrder pizzaOrder) {
    repository.save(pizzaOrder);
  }
}
