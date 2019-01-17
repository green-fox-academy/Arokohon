package com.greenfox.practice3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PizzaOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String address;
  private String pizza;
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
}
