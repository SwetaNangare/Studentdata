package com.example.FordInterview.Studentdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ControllerTestStudent {

    @InjectMocks
    StudentController controller;

    @Mock
    StudentService studentService;

    @Test
    public void controllertest(){
        Student expected=new Student(1,"Aram","aram@gmail.com");
        when(studentService.create(new Student())).thenReturn(expected);
        ResponseEntity<Student> actual=controller.create(new Student());
        assertEquals(HttpStatus.CREATED,actual.getStatusCode());
        assertEquals(expected,actual.getBody());
    }
}
