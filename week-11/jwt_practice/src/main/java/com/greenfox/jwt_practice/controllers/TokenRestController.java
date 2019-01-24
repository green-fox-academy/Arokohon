package com.greenfox.jwt_practice.controllers;

import com.greenfox.jwt_practice.models.JwtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenRestController {

  private TokenRestController jwtGenerator;

  @Autowired
  public TokenRestController(TokenRestController jwtGenerator) {
    this.jwtGenerator = jwtGenerator;
  }

  @PostMapping("/{userName}")
  public String generate(@RequestBody final JwtUser jwtUser) {

    return jwtGenerator.generate(jwtUser);
  }
}
