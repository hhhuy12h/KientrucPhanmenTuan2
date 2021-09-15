package com.example.huy2h.error;

import com.example.huy2h.Entity.ErrorMessage;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@ResponseStatus


public class RestResponseEntityExceptionHanlder  extends StudentNotFoundException{
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorMessage> departmenNotFoundException(
            StudentNotFoundException exception , WebRequest request) {
        ErrorMessage message =
                new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);}
    }



