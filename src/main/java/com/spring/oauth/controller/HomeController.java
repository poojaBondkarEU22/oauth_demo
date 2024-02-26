package com.spring.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/oauth")
public class HomeController {

    @GetMapping
    public String testOAuth(Principal principal) {
        return "Hello World from OAuth.";
    }
}
