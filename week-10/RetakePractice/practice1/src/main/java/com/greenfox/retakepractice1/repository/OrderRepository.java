package com.greenfox.retakepractice1.repository;

import com.greenfox.retakepractice1.model.FoodOrder;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

@Repository
public interface OrderRepository extends CrudRepository<FoodOrder, Long> {

  boolean existsById(Long id);

  Iterable<FoodOrder> findByStatus(String status);

  Iterable<FoodOrder> findByStatusAndTopping(String status, String topping);

  @Modifying
  @Transactional
  @Query(value = "UPDATE food_order f SET f.status = :status WHERE f.id = :id", nativeQuery = true)
  void updateOrderStatus(@RequestParam("id") Long id, @RequestParam("status") String status);
}
