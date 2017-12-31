package com.taketest.springbootkotlinintellij.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("java")
public class JavaController {
    @GetMapping
    public String index(Model model){
        model.addAttribute("word", "javaからだよ");
        return "hello";
    }
}