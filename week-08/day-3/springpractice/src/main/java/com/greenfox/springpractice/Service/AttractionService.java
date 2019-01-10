package com.greenfox.springpractice.Service;

import com.greenfox.springpractice.Model.Attraction;

import java.util.List;

public interface AttractionService {

  Iterable<Attraction> getAttractions();
  void addAttraction(Attraction attraction);
  void editAttraction(Attraction attraction);
}
