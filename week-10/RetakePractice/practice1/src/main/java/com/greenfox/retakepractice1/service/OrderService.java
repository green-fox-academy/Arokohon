package com.greenfox.retakepractice1.service;

import com.greenfox.retakepractice1.model.FoodOrder;

public interface OrderService {

  void addOrder(FoodOrder foodOrder);

  FoodOrder getOrderById(Long id);

  boolean existsById(Long id);

  Iterable<FoodOrder> findByStatus(String status);

  Iterable<FoodOrder> findByStatusAndTopping(String status, String topping);

  void updateOrderStatusById(Long id, String status);
}
