package com.alibou.springdemo.Student;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstname;

    private String lastname;

    private LocalDate dateOfBirth;

    private String email;

    private int age;
}


