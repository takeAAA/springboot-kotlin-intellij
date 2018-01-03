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
        model.addAttribute("language", "javaからだよ");
        JavaEmployee javaEmployee = new JavaEmployee("鈴木", "一郎");
        model.addAttribute("word",
                javaEmployee.getFullName() + "ちゃんは" +
                                javaEmployee.getAge() + "歳。来年は" +
                                javaEmployee.elapse() + "歳です。");
        ;
        return "hello";
    }
}