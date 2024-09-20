package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.time.LocalDate;

@Controller
public class TodoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/list-todos", method=RequestMethod.GET)
    public String listAllTodos(ModelMap modelMap){
        modelMap.put("todos", todoService.getTodoListByUsername("in28minutes"));
        return "listTodos";
    }

    @RequestMapping(value="/add-todo", method=RequestMethod.GET)
    public String getAddTodo(ModelMap modelMap){
        modelMap.put("todo", new Todo(4, "username set in get request handler", "", LocalDate.now().plusYears(1), false));
        return "addTodo";
    }

    @RequestMapping(value="/add-todo", method=RequestMethod.POST)
    public String addTodo(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            return "addTodo";
        }
        todoService.addTodo((String)modelMap.get("name"), todo.getDescription(), LocalDate.now().plusYears(1), false);
        logger.debug("Todo date = " + todo.getTargetDate());
        return "redirect:/list-todos";
    }
}
