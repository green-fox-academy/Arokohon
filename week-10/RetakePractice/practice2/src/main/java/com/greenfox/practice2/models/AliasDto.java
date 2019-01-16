package com.greenfox.practice2.models;

public class AliasDto {

  private long id;
  private String url;
  private String aliasName;
  private long hitCount;

  public AliasDto(long id, String url, String aliasName, long hitCount) {
    this.id = id;
    this.url = url;
    this.aliasName = aliasName;
    this.hitCount = hitCount;
  }

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

  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public long getHitCount() {
    return hitCount;
  }

  public void setHitCount(long hitCount) {
    this.hitCount = hitCount;
  }
}
