package com.example.huy2h.error;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super();
    }
    public  StudentNotFoundException(String message ,Throwable cause){
        super(message, cause);
    }
    public  StudentNotFoundException(Throwable cause){
        super( cause);
    }
    public  StudentNotFoundException(String message ,Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause,enableSuppression,writableStackTrace);
    }

}
