package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  ToDoRepo todolist;

  @Autowired
  public ConnectionwithmysqlApplication(ToDoRepo todolist) {
    this.todolist = todolist;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}

