package com.in28minutes.springboot.myfirstwebapp.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String getAddTodo(){
        return "addTodo";
    }

    @RequestMapping(value="/add-todo", method=RequestMethod.POST)
    public String addTodo(@RequestParam String description, ModelMap modelMap){
        todoService.addTodo((String)modelMap.get("name"), description, LocalDate.now().plusYears(1), false);
        logger.debug("modelMap.get(\"" + "name)" + "\" is: " + modelMap.get("name"));
        return "redirect:/list-todos";
    }
}
