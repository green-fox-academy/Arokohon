package com.greenfox.practice2.controllers;

import com.greenfox.practice2.models.Alias;
import com.greenfox.practice2.models.AliasDto;
import com.greenfox.practice2.services.AliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AliasRestController {

  @Autowired
  AliasServiceImpl service;

  @GetMapping("/api/links")
  public List<AliasDto> aliasDtoList() {
    return service.aliasDtos();
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<Object> deleteAlias(@RequestBody Alias alias,
                                            @PathVariable long id) {
    if (service.findById(id).getSecretCode() == alias.getSecretCode()) {
      service.deleteById(id);
      return new ResponseEntity(HttpStatus.NO_CONTENT);
    } else if (service.findById(id).getSecretCode() != alias.getSecretCode()) {
      return new ResponseEntity(HttpStatus.FORBIDDEN);
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }
}
