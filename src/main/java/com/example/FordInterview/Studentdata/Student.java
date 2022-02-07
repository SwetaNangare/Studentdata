package com.example.FordInterview.Studentdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentId;
    private String firstName;
    private String eMail;
}
