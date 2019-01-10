package com.greenfox.aliasapp.Service;

import com.greenfox.aliasapp.Model.Alias;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AliasService {

  List<Alias> getAllAlias();
  void saveAlias(Alias alias);
  void deleteAlias(Alias alias);
}
