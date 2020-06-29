package com.healthmgmt.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.healthmgmt.app.service.LoginService;

@Controller
@SessionAttributes("name")
@RequestMapping("/healthmgmt")
public class LoginController {

    @Autowired
    LoginService service;

    @GetMapping
	public String webget (){
		return " entered in the Login controller /healthmgt";
	
	}
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
    	System.out.println("in show longin page");
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }

}