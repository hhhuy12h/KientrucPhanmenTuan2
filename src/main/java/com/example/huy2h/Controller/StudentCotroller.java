package com.example.huy2h.Controller;


import com.example.huy2h.DTO.UserDTO;
import com.example.huy2h.Entity.Student;
import com.example.huy2h.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentCotroller {
    @Autowired
    private StudentService studentService;
    @GetMapping("/users")
    public List<UserDTO> getUserList(){
       List<Student> users = studentService.getListStudent() ;
       List<UserDTO> dtoList = new ArrayList<>();
       for ( Student student: users){
           dtoList.add(new UserDTO(student));
       }
       return dtoList;
    }


}
