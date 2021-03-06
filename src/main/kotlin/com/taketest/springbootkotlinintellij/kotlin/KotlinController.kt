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
        model.addAttribute("language", "kotlinからだよ")
        val kotlinEmployee = KotlinEmployee("鈴木", "一郎")
        model.addAttribute("word",
                "${kotlinEmployee.getFullName()}ちゃんは${kotlinEmployee.age}歳。来年は${kotlinEmployee.elapse()}歳です。")
        return "hello"
    }
}