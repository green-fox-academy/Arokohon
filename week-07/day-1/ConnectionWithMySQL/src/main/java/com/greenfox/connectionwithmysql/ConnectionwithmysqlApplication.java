package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.controllers.TodoController;
import com.greenfox.connectionwithmysql.models.ToDo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    TodoController.todorepo.save(new ToDo("Finishing 3rd task", false, false));
    TodoController.todorepo.save(new ToDo("Finishing 3rd task", true, true));
  }
}

