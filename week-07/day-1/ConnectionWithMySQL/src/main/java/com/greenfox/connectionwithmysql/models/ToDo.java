package com.greenfox.connectionwithmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo(String name, boolean urgent) {
    this.name = name;
    this.id = id;
    this.isDone = false;
    this.isUrgent = urgent;
  }

  public ToDo() {
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }
}
