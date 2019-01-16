package com.greenfox.practice2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alias {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String url;
  private String alias;
//  private long secretCode;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

//  public long getSecretCode() {
//    return secretCode;
//  }
//
//  public void setSecretCode(long secretCode) {
//    this.secretCode = secretCode;
//  }
}
