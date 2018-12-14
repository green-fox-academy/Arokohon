package com.greenfoxacademy.webshop;

public class WebshopItem {

  String name;
  int price;
  String description;
  int qty;

  public WebshopItem(String name, int price, String description, int qty) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.qty += qty;
  }
}
