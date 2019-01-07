package com.greenfox.rest_backend_workshop.Repository;

public class ErrorMessage {

  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public ErrorMessage() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
