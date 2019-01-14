package com.greenfox.retakepractice1.service;

import com.greenfox.retakepractice1.model.foodOrder;

public interface OrderService {

  void addOrder(foodOrder foodOrder);

  foodOrder getOrderById(Long id);

  boolean existsById(Long id);
}
