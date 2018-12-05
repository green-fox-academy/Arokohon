package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private String name;
  private long id;
  private static AtomicLong idCounter = new AtomicLong(1);
  private String content;

  public Greeting(String name, String content, long id) {
    this.name = name;
    this.content = content;
    this.id = idCounter.getAndIncrement();
  }

  public String getName() {
    return name;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
