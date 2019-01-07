package com.greenfox.rest_backend_workshop.Service;

import com.greenfox.rest_backend_workshop.Repository.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class Services {

  public Object doubling(Integer number) {
    if (number == null) {
      return new ErrorMessage("Please provide an input!");
    }else {
      return new Double(number);
    }
  }
}
