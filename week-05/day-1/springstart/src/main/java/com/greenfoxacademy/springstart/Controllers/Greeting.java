package com.greenfoxacademy.springstart.Controllers;

public class Greeting {

  private long id;
  private String content;

  public Greeting(String content, long id) {
    this.content = content;
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
