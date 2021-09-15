package com.example.huy2h.Service;


import com.example.huy2h.Entity.Student;
import com.example.huy2h.error.StudentNotFoundException;

import java.util.List;

public interface StudentService {
    void saveEmployee(Student s);
    List<Student> findAll();
    Student findById(long id);
    void deleteById(long id);

    public Student getStudentId(long id)  throws StudentNotFoundException ;
}
