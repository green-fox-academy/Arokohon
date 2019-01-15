package com.greenfox.retakepractice1.controller;

import static com.greenfox.retakepractice1.service.Validation.validateOrderStatus;

import com.greenfox.retakepractice1.model.FoodOrder;
import com.greenfox.retakepractice1.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderRestController {

  private OrderServiceImpl service;

  @Autowired
  public OrderRestController(OrderServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/api/orders")
  public ResponseEntity<Iterable<FoodOrder>> orderList(
      @RequestParam(value = "type") String type,
      @RequestParam(value = "status") String status) {
    if (type.equals("vegetarian") && validateOrderStatus(status)) {
      return new ResponseEntity<>(service.findByStatusAndTopping(status, "smoked tofu"), HttpStatus.OK);
    } else if (type.equals("all") && validateOrderStatus(status)) {
      return new ResponseEntity<>(service.findByStatus(status), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  @PatchMapping("/api/orders/{id}")
  public ResponseEntity<String> modifyOrderStatus(
      @PathVariable("id") Long id,
      @RequestBody FoodOrder order) {
    if (validateOrderStatus(order.getStatus()) && service.existsById(id)) {
      service.updateOrderStatusById(id, order.getStatus());
      return new ResponseEntity<>("Order status modified", HttpStatus.OK);
    } else if (!validateOrderStatus(order.getStatus())) {
      return new ResponseEntity<>("Order status not valid", HttpStatus.BAD_REQUEST);
    } else if (!service.existsById(id)) {
      return new ResponseEntity<>("No order exists with id: " + id, HttpStatus.NOT_FOUND);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }
}
