package com.greenfox.aliasapp.Service;

import com.greenfox.aliasapp.Model.Alias;
import com.greenfox.aliasapp.Repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AliasServiceImpl implements AliasService{

  @Autowired
  AliasRepository repository;

  @Override
  public List<Alias> getAllAlias() {
    return null;
  }

  @Override
  public void saveAlias(Alias alias) {

  }

  @Override
  public void deleteAlias(Alias alias) {

  }
}
