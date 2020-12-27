package com.example.bookmanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    /*@GetMapping("/")
    public String homePage(Model model) {
        System.out.println("qwerty");
        model.addAttribute("appName", appName);
        return "index";
    }*/
    @GetMapping("/")
    public String root() {
        return "index";
    }

    /*@GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }*/

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/")
    public String checkCredentials() {
        if(){
            return "Book";
        }else{
            return "loginError";
        }
    }

    /*@GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }*/
}
