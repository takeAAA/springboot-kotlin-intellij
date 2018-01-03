package com.taketest.springbootkotlinintellij.kotlin

class KotlinEmployee(val firstName: String, val lastName: String, var age: Int = 0) {

    fun getFullName(): String = firstName + " " + lastName
    fun elapse(years: Int = 1): Int {
        age += years
        return age
    }
}