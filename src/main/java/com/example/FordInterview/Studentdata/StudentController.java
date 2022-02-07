package com.example.FordInterview.Studentdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/studentdata")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<Student> create(@RequestBody Student student){
        Student obj= studentService.create(student);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

}
