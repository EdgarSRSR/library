package com.example.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employees")
public class LoginController {

    // to login form page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm() {
        return "login";
    }


    //checking for login credentials
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "text/html")
    public String login(@ModelAttribute(name = "LoginForm") LoginForm loginForm, Model model) {

        String username = LoginForm.getUsername();
        String email = loginForm.getEmail();

        if (username != null && email != null ) {
            return "admin";
        }

        return "index";
        /*
        //if the username and email is wrong
        model.addAttribute("invalidCredentials",true);
        //return again to login page
        return "login";*/
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        //model.addObject("title", "Spring Security Login Form - Database Authentication");
        model.addObject("message", "This page is for ROLE_ADMIN only!");
        model.setViewName("admin");
        return model;

    }



}
