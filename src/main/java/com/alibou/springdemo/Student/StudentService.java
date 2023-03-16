package com.alibou.springdemo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
List<Student> findAllStudents();

Student findByEmail(String email);

void delete (String email);

    Student update (Student s);
Student save (Student s);

}
