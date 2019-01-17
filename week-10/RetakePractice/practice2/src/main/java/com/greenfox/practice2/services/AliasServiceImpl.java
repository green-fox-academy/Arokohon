package com.greenfox.practice2.services;

import static com.greenfox.practice2.services.SecretCodeGenerator.randFourDigitLong;
import com.greenfox.practice2.models.Alias;
import com.greenfox.practice2.models.AliasDto;
import com.greenfox.practice2.repositories.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AliasServiceImpl implements AliasService{

  AliasRepository repository;

  @Autowired
  public AliasServiceImpl(AliasRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addAlias(Alias alias) {
    alias.setSecretCode(randFourDigitLong());
    repository.save(alias);
  }

  @Override
  public Alias findById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void deleteById(Long id) {
    repository.deleteById(id);
  }

  @Override
  public boolean aliasExistsByName(String aliasName) {
    return repository.existsAliasByAliasName(aliasName);
  }

  @Override
  public Alias findAliasByName(String aliasName) {
    return repository.findAliasByAliasName(aliasName);
  }

  public void incHitCount(String aliasName) {
    repository.incHitCount(repository.findAliasByAliasName(aliasName).getId());
  }

  public AliasDto tranformAlias(Alias alias) {
    return new AliasDto(alias.getId(),alias.getUrl(), alias.getAliasName(), alias.getHitCount());
  }

  public List<AliasDto> aliasDtos() {
    List<AliasDto> aliasDtos = new ArrayList<>();
    for (Alias alias: repository.findAll()) {
      aliasDtos.add(tranformAlias(alias));
    }
    return aliasDtos;
  }
}
