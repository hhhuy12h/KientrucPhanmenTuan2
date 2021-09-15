package com.example.huy2h.Controller;


import com.example.huy2h.Entity.Student;
import com.example.huy2h.Service.StudentService;
import com.example.huy2h.error.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentCotroller {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student{id}")
    public Student getStudentById(@PathVariable("id") Long id) throws StudentNotFoundException {

        return studentService.getStudentId(id);
    }

}
