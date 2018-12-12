package com.greenfoxacademy.practice;

public class BankAccount {

  private boolean isGood;
  private String title;
  private static int nextId = 1;
  private int id;
  private String name;
  private double balance;
  private String currency;
  private String animalType;

  public BankAccount(String name, String title, double balance, String currency, String animalType, boolean isGood) {
    this.id = nextId++;
    this.name = name;
    this.title = title;
    this.balance = balance;
    this.currency = currency;
    this.animalType = animalType;
    this.isGood = isGood;
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


  public static int getNextId() {
    return nextId;
  }

  public static void setNextId(int nextId) {
    BankAccount.nextId = nextId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public String goodOrBad() {
    if (this.isGood) {
      return "Good guy";
    } else {
      return "Bad scum!";
    }
  }
}
