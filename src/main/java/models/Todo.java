package models;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "todos")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    private Boolean completed = false;

    public Todo() {}

    public Todo(String title) {
        this.title = title;
    }

    // Getters and setters
}
