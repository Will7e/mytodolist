package models;



import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private String title;

    private Boolean completed = false;

    public Todo() {}

    public Todo(String title) {
        this.title = title;
    }

    // Getters and setters
}
