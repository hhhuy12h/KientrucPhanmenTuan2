package com.example.huy2h.DTO;

import com.example.huy2h.Entity.Student;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
public class UserDTO {
    private  String email ;
    private  String firstName ;
    private  String lastName ;


    public UserDTO(Student original) {
        this.email= original.getEmail();
        this.firstName= original.getFirst_name();
        this.lastName= original.getLast_name();

    }

}
