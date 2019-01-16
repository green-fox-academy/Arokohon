package com.greenfox.practice2.services;

import com.greenfox.practice2.models.Alias;
import com.greenfox.practice2.repositories.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliasServiceImpl implements AliasService{

  AliasRepository repository;

  @Autowired
  public AliasServiceImpl(AliasRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addAlias(Alias alias) {
    repository.save(alias);
  }
}
