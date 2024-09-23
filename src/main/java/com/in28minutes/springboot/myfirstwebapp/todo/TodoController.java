package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class TodoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TodoRepository todoRepository;

    @RequestMapping(value="/list-todos", method=RequestMethod.GET)
    public String listTodosByUsername(ModelMap modelMap){
        modelMap.addAttribute("todos", todoRepository.findByUsername(this.getLoggedInUserUsername()));
        return "listTodos";
    }

    @RequestMapping(value="/add-todo", method=RequestMethod.GET)
    public String getAddTodo(ModelMap modelMap){
        modelMap.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @RequestMapping(value="/add-todo", method=RequestMethod.POST)
    public String addTodo(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "addTodo";
        todo.setUsername(this.getLoggedInUserUsername());
        todoRepository.save(todo);
        return "redirect:/list-todos";
    }

    @RequestMapping(value="/delete-todo", method=RequestMethod.GET)
    public String deleteTodo(@RequestParam int id){
        this.todoRepository.deleteById(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value="/update-todo", method=RequestMethod.GET)
    public String getUpdateTodo(@RequestParam int id, ModelMap modelMap){
        modelMap.addAttribute("todo", this.todoRepository.findById(id).get());
        return "addTodo";
    }

    @RequestMapping(value="/update-todo", method=RequestMethod.POST)
    public String updateTodo(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult){
        return this.addTodo(modelMap, todo, bindingResult);
    }

    private String getLoggedInUserUsername(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
