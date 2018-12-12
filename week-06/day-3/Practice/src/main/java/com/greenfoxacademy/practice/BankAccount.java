package com.greenfoxacademy.practice;

public class BankAccount {

  private String name;
  private double balance;
  private String currency;
  private String animalType;

  public BankAccount(String name, double balance, String currency, String animalType) {
    this.name = name;
    this.balance = balance;
    this.currency = currency;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
