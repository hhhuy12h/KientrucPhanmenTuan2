package com.example.huy2h.Service;


import com.example.huy2h.Entity.Student;
import com.example.huy2h.reponsitory.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentReponsitory studentReponsitory;

    @Override
    public void saveEmployee(Student s) { studentReponsitory.save(s);

    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentReponsitory.findAll();
    }






    @Override
    public Student findById(long id) {
        Optional<Student> rs = studentReponsitory.findById(Long.valueOf(id));
        Student s = null;
        if(rs.isPresent()){
            s=rs.get();
        }else{
            throw new RuntimeException("Did not find");
        }

        return s;
    }

    @Override
    public void deleteById(long id) {
        studentReponsitory.deleteById(Long.valueOf(id));

    }
}
