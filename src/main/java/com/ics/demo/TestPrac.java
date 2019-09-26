package com.ics.demo;

import com.ics.demo.models.StudentPrac;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public class TestPrac implements CommandLineRunner {
    private final FeignPrac feignPrac;

    public TestPrac(FeignPrac feignPrac) {
        this.feignPrac = feignPrac;
    }

    @Override
    public void run(String... args) throws Exception {

        List<StudentPrac> students = feignPrac.getAllStudents();
//        System.out.println(students);

//        StudentPrac newStudent = feignPrac.createStudent(new StudentPrac("94919","Trevor"));

        feignPrac.enrollStudent((long)2,(long)6);

        feignPrac.validate((long) 2,(long) 1569431635);
    }
}
