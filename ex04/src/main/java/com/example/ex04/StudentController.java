package com.example.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    DataSource dataSource;




    @GetMapping("/students")
    public String students(Model model){
        model.addAttribute("hi","ㅎㅎㅎㅎㅎㅎㅎ");
        List<Student> list = new ArrayList<>();
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age =rs.getInt("age");
                String email = rs.getString("email");
                String created_at = rs.getString("created_at");
                System.out.println(id+" "+name+" "+age+" "+email+" "+created_at);

                list.add(new Student(id,name,age,email,created_at));

            }
            model.addAttribute("students",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "students";
    }
}
