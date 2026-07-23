package com.example.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AAController {
    @GetMapping("/aa")
    public String aa(){
        return "aa";
    }
}