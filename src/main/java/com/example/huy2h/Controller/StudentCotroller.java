package com.example.huy2h.Controller;


import com.example.huy2h.Entity.Student;
import com.example.huy2h.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class StudentCotroller {
    @Autowired
    private StudentService studentService;

    @PostMapping("/employees")
    public Student saveStudent(@Valid @RequestBody Student student){

        return studentService.saveStudent(student);
    }


}
