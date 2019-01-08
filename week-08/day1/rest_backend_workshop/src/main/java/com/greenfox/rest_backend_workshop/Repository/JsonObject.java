package com.greenfox.rest_backend_workshop.Repository;

public class JsonObject {

  private int until;

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public JsonObject(int until) {
    this.until = until;
  }

  public JsonObject() {
  }
}
