package com.greenfox.listing_todos_with_h2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;

  private String name;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo(String name) {
    this.name = name;
    this.id = id;
    this.isDone = false;
    this.isUrgent = false;
  }

  public ToDo() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}
