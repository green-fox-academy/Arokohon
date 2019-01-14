package com.greenfox.retakepractice1.repository;

import com.greenfox.retakepractice1.model.foodOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<foodOrder, Long> {

  boolean existsById(Long id);
}
