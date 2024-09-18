package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String getWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
        if(authenticationService.authenticate(name, password))
        {
            modelMap.put("name", name);
            return "welcome";
        }
        modelMap.put("errorMessage", "Invalid credentials! Please try again.");
        return "login";
    }
}
