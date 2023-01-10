package com.example.mytodolist.controller;

import com.example.mytodolist.models.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.mytodolist.services.TodoService;

import java.util.List;


@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @PostMapping
    public HttpStatus save(@RequestBody Todo todo) {
        try {
            todoService.save(todo);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.BAD_REQUEST;
        }

    }

    @GetMapping("/{id}")
    public HttpStatus findById(@PathVariable Long id) {

        try{
            todoService.findById(id);
            return HttpStatus.OK;
        }catch (Exception e){
            return  HttpStatus.NOT_FOUND;
        }

    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteById(@PathVariable Long id) {
        try {
            todoService.deleteById(id);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.BAD_REQUEST;
        }

    }
}

