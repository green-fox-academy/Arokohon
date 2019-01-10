package com.greenfox.aliasapp.Repository;

import com.greenfox.aliasapp.Model.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository<Alias, Long> {
}
