package com.greenfox.aliasapp.Service;

import com.greenfox.aliasapp.Model.Alias;

import java.util.List;

public interface AliasService {

  List<Alias> getAllAlias();
  void saveAlias(Alias alias);
  void deleteAlias(Alias alias);
}
