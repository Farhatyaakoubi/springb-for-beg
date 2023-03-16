package com.alibou.springdemo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
   return List.of(
            new Student(
                        "Foulen",
                                "BenFoulen",
                        LocalDate.now(),
                        "Foulen@contact.com",
                                43
                                ),

                                new Student(
                "Foulen lekher kho louwel",
                        "BenFoulen lekhert",
                LocalDate.now(),
                "FoulenLekher@contact.com",
                        24
                        )
   );
}
}
