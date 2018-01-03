package com.taketest.springbootkotlinintellij.java;

public class JavaEmployee {
    private final String firstName;
    private final String lastName;
    private int age;

    public JavaEmployee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public JavaEmployee(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int elapse(int years) {
        age += years;
        return age;
    }

    public int elapse() {
        return elapse(1);
    }
}
