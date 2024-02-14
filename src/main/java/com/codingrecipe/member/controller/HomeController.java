package com.codingrecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
