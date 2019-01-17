package com.greenfox.practice3.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PizzaOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String address;
  private String pizza;

  @Temporal(TemporalType.TIMESTAMP)
  private Date orderDate;
//  private long hitCount;

  public PizzaOrder() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPizza() {
    return pizza;
  }

  public void setPizza(String pizza) {
    this.pizza = pizza;
  }
//
//  public long getHitCount() {
//    return hitCount;
//  }
//
//  public void setHitCount(long hitCount) {
//    this.hitCount = hitCount;
//  }

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }
}
