package com.greenfox.rest_backend_workshop.Repository;

public class Double {

  private int number;
  private int doubledNumber;

  public Double(int number) {
    this.number = number;
    this.doubledNumber = number * 2;
  }

  public Double() {
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getDoubledNumber() {
    return doubledNumber;
  }

  public void setDoubledNumber(int doubledNumber) {
    this.doubledNumber = doubledNumber;
  }
}
