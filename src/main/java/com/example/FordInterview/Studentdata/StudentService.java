package com.example.FordInterview.Studentdata;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student create(Student student){
        student.setStudentId(1);
        student.setFirstName("Heramb");
        student.setEMail("Heramb@gmail.com");
        return student;
    }
}
