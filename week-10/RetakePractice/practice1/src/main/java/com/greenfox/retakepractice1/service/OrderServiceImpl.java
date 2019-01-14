package com.greenfox.retakepractice1.service;

import com.greenfox.retakepractice1.model.foodOrder;
import com.greenfox.retakepractice1.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

  private OrderRepository repository;

  @Autowired
  public OrderServiceImpl(OrderRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addOrder(foodOrder foodOrder) {
    foodOrder.setStatus("ordered");
    repository.save(foodOrder);
  }

  @Override
  public foodOrder getOrderById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public boolean existsById(Long id) {
    return repository.existsById(id);
  }
}
