package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/list-todos", method= RequestMethod.GET)
    public String listAllTodos(ModelMap modelMap){
        modelMap.put("todos", todoService.getTodoListByUsername("in28minutes"));
        return "listTodos";
    }
}
