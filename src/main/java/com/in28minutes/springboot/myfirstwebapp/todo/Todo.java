package com.in28minutes.springboot.myfirstwebapp.todo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity(name="Todos_Table")
public class Todo {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    @Size(min=10, message = "Enter at least 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean isComplete;

    public Todo(){};

    public Todo(int id, String username, String description, LocalDate targetDate, boolean isComplete){
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isComplete = isComplete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", isComplete=" + isComplete +
                '}';
    }
}
