package com.greenfox.retakepractice1.service;

import com.greenfox.retakepractice1.model.FoodOrder;
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
  public void addOrder(FoodOrder foodOrder) {
    foodOrder.setStatus("ordered");
    repository.save(foodOrder);
  }

  @Override
  public FoodOrder getOrderById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public boolean existsById(Long id) {
    return repository.existsById(id);
  }

  @Override
  public Iterable<FoodOrder> findByStatus(String status) {
    return repository.findByStatus(status);
  }

  @Override
  public Iterable<FoodOrder> findByStatusAndTopping(String status, String topping) {
    return repository.findByStatusAndTopping(status, topping);
  }

  @Override
  public void updateOrderStatusById(Long id, String status) {
    repository.updateOrderStatus(id, status);
  }
}
