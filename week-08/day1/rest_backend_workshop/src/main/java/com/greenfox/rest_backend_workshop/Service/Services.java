package com.greenfox.rest_backend_workshop.Service;

import com.greenfox.rest_backend_workshop.Repository.AppendA;
import com.greenfox.rest_backend_workshop.Repository.DoUntil;
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

  public AppendA addingA(String word) {
    return new AppendA(word);
  }

  public DoUntil DoUntilNum(String whatToDo, int input) {
    if (whatToDo.equals("sum")) {
      return sumUntil(input);
    } else {
      return factorUntil(input);
    }
  }

  public DoUntil sumUntil(Integer input) {
    int result = 0;
    for (int i = 1; i <= input; i++) {
      result = result + i;
    }
    return new DoUntil(result);
  }

  public DoUntil factorUntil(Integer input) {
    int result = 1;
    for (int i = 1; i <= input; i++) {
      result = result * i;
    }
    return new DoUntil(result);
  }
}
