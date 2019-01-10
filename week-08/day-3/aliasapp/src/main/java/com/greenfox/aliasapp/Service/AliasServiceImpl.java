package com.greenfox.aliasapp.Service;

import com.greenfox.aliasapp.Model.Alias;
import com.greenfox.aliasapp.Repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliasServiceImpl implements AliasService{

  @Autowired
  AliasRepository repository;

  @Override
  public List<Alias> getAllAlias() {
    return null;
  }

  @Override
  public void saveAlias(Alias alias) {
    repository.save(alias);
  }

  @Override
  public void deleteAlias(Alias alias) {

  }
}
