package data;

import models.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.TodoService;


@Component
public class Seeder implements CommandLineRunner {

    private final TodoService todoService;

    public Seeder(TodoService todoService ) {
        this.todoService = todoService;

    }

    @Override
    public void run(String... args) {
        todoService.save(new Todo("Hello world"));
    }
}

