package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();

    private static int todoListCount = 3;

    static{
        todoList.add(new Todo(1, "in28minutes", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todoList.add(new Todo(1, "in28minutes", "Learn DevOps",
                LocalDate.now().plusYears(2), false));
        todoList.add(new Todo(1, "in28minutes", "Learn Full Stack Development",
                LocalDate.now().plusYears(3), false));
    }

    public List<Todo> getTodoListByUsername(String username){
        return todoList;
    }

    public void addTodo(String name, String description, LocalDate targetDate, boolean isComplete){
        todoList.add(new Todo(++todoListCount, name, description, targetDate, isComplete));
    }
}
