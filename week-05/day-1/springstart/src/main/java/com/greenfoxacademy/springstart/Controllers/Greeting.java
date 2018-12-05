package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestParam;

public class Greeting {

  private String name;
  private long id;
  private String content;

  public Greeting(String name, String content, long id) {
    this.name = name;
    this.content = content;
    this.id = id;
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
