package com.taketest.springbootkotlinintellij.kotlin

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("kotlin")
class KotlinController {
    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("word", "kotlinからだよ")
        return "hello"
    }
}