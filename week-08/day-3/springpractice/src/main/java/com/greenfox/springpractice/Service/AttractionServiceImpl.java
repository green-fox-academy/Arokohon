package com.greenfox.springpractice.Service;

import com.greenfox.springpractice.Model.Attraction;
import com.greenfox.springpractice.Repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

  private AttractionRepository repository;

  @Autowired
  public AttractionServiceImpl(AttractionRepository repository) {
    this.repository = repository;
  }

  @Override
  public Iterable<Attraction> getAttractions() {
    return repository.findAll();
  }

  @Override
  public void addAttraction(Attraction attraction) {
    repository.save(attraction);
  }

  @Override
  public void editAttraction(Attraction attraction) {

  }
}
