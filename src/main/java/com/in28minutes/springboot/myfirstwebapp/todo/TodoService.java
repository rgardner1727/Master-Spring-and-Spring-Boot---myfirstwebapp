package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();

    private static int todoListCount = 3;

    static{
        todoList.add(new Todo(1, "in28minutes", "Learn AWS Now!",
                LocalDate.now().plusYears(1).toString(), false));
        todoList.add(new Todo(2, "in28minutes", "Learn DevOps",
                LocalDate.now().plusYears(2).toString(), false));
        todoList.add(new Todo(3, "in28minutes", "Learn Full Stack Development",
                LocalDate.now().plusYears(3).toString(), false));
    }

    public List<Todo> getTodoListByUsername(String username){
        return todoList;
    }

    public void addTodo(String name, String description, String targetDate, boolean isComplete){
        todoList.add(new Todo(++todoListCount, name, description, targetDate, isComplete));
    }

    public void deleteTodoById(int id){
        todoList.removeIf(todo -> todo.getId() == id);
    }

    public Todo getTodoById(int id){
        return todoList.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public void updateTodo(@Valid Todo formTodo){
        Todo todoToUpdate = this.getTodoById(formTodo.getId());
        todoToUpdate.setId(formTodo.getId());
        todoToUpdate.setUsername(formTodo.getUsername());
        todoToUpdate.setDescription(formTodo.getDescription());
        todoToUpdate.setTargetDate(formTodo.getTargetDate());
        todoToUpdate.setIsComplete(formTodo.getIsComplete());
    }
}
