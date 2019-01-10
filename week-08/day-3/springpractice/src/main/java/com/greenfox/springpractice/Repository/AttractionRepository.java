package com.greenfox.springpractice.Repository;

import com.greenfox.springpractice.Model.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
