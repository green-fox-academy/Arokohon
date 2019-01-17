package com.greenfox.practice3.repositories;

import com.greenfox.practice3.models.PizzaOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaOrderRepository extends CrudRepository<PizzaOrder, Long> {
}
