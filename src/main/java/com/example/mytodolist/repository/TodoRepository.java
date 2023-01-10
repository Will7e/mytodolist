package com.example.mytodolist.repository;

import com.example.mytodolist.models.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {
}
