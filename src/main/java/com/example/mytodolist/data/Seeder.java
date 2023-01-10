package com.example.mytodolist.data;

import com.example.mytodolist.models.Todo;
import com.example.mytodolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.mytodolist.services.TodoService;

import java.util.Arrays;


@Component
public class Seeder implements CommandLineRunner {



    private final TodoRepository todoRepository;

    public Seeder(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) {
        todoRepository.saveAll(Arrays.asList(
                new Todo("Cook","Meals prep",false),
                new Todo("Push up","100 push up",false),
                new Todo("Learn Spring Boot","In one week",true),
                new Todo("Create a todo application","Today",true)));
    }
}

