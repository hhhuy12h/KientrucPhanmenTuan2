package com.example.huy2h.Controller;


import com.example.huy2h.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentCotroller {
    @Autowired
    private StudentService studentService;

}
