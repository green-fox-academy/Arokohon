package com.greenfox.rest_backend_workshop.Service;

import com.greenfox.rest_backend_workshop.Repository.ErrorMessage;
import com.greenfox.rest_backend_workshop.Repository.Greeting;
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

  public Object greeting(String name, String title) {
    if (name.isEmpty() && title.isEmpty()) {
      return new ErrorMessage("Please provide a name and a title!");
    }else if (name.isEmpty()) {
      return new ErrorMessage("Please provide a name!");
    }else if (title.isEmpty()) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new Greeting(name, title);
    }
  }
}
