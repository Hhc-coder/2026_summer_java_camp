package com.example.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public class Student{
    private int id;
    private String name;
    private int age;
    private String email;
    private String created_at;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Student(int id, String name, int age, String email, String created_at) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.created_at = created_at;
    }
}