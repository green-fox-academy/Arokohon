package com.greenfox.retakepractice1.service;

public class Validation {

  public static boolean validateOrderStatus(String status) {
    if (status.equals("ordered") || status.equals("inprogress") || status.equals("done")) {
      return true;
    } else {
      return false;
    }
  }
}
