package com.yash.Spring.Security.project.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class HelloController {

    @GetMapping("/home")
    public String greet (HttpServletRequest req ) {
        return "Welcome" + req.getSession().getId() ;
    }
}
