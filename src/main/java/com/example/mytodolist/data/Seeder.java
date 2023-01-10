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
                new Todo("Cook",false),
                new Todo("Push up",false),
                new Todo("Learn Spring Boot",true),
                new Todo("Create a todo application",true)));
    }
}

