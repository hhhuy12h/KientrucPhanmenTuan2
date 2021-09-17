package com.example.huy2h.Service;


import com.example.huy2h.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(long id);
    void deleteById(long id);

    public Student saveStudent(Student employee);
}
