package com.greenfox.listing_todos_with_h2;

import com.greenfox.listing_todos_with_h2.controllers.TodoController;
import com.greenfox.listing_todos_with_h2.models.ToDo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosWithH2Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ListingTodosWithH2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    TodoController.todorepo.save(new ToDo("Don't give up!"));
    TodoController.todorepo.save(new ToDo("Go home and drunk like crazy!"));
    TodoController.todorepo.save(new ToDo("Learn Spring like no tomorrow!"));
    TodoController.todorepo.save(new ToDo("Thank you guys a lot. :)"));
  }
}

