package com.greenfox.jwt_practice.security;

import com.greenfox.jwt_practice.models.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {


  private String secret = "youtube";

  public JwtUser validate(String token) {

    JwtUser jwtUser = null;
    try {
      Claims body = Jwts.parser()
          .setSigningKey(secret)
          .parseClaimsJwt(token)
          .getBody();
      jwtUser = new JwtUser();
      jwtUser.setUserName(body.getSubject());
      jwtUser.setId(Long.parseLong((String)body.get("userId")));
      jwtUser.setRole((String) body.get("role"));
    } catch (Exception e) {
      System.out.println(e);
    }

    return jwtUser;
  }
}
