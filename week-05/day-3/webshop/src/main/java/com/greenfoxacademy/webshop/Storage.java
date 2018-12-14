package com.greenfoxacademy.webshop;

import java.util.ArrayList;
import java.util.List;

public class Storage {

  List<WebshopItem> storage;

  public Storage() {
    storage = new ArrayList<>();
  }

  public void addToStorage(WebshopItem item) {
    storage.add(item);
  }

  public List<WebshopItem> getStorage() {
    return storage;
  }

  public void setStorage(List<WebshopItem> storage) {
    this.storage = storage;
  }
}
