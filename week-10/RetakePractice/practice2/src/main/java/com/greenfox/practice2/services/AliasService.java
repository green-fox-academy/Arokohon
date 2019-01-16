package com.greenfox.practice2.services;

import com.greenfox.practice2.models.Alias;

public interface AliasService {

  void addAlias(Alias alias);
  Alias findById(Long id);
  void deleteById(Long id);
  boolean aliasExistsByName(String aliasName);
  Alias findAliasByName(String aliasName);
}
