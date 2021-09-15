package com.example.huy2h.reponsitory;


import com.example.huy2h.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReponsitory extends CrudRepository<Student,Long>{

}

