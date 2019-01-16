package com.greenfox.practice2.services;

public class SecretCodeGenerator {

  public static Long randFourDigitLong() {
    Long code = new Long((int)(Math.random()*10000)+1000);
    return code;
  }
}
