package com.greenfox.jwt_practice.controllers;

import com.greenfox.jwt_practice.models.JwtUser;
import com.greenfox.jwt_practice.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenRestController {

  private JwtGenerator jwtGenerator;

  @Autowired
  public TokenRestController(JwtGenerator jwtGenerator) {
    this.jwtGenerator = jwtGenerator;
  }

  @PostMapping("/{userName}")
  public String generate(@RequestBody final JwtUser jwtUser) {

    return jwtGenerator.generate(jwtUser);
  }
}
