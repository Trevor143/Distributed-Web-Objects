package com.ics.demo;

import com.ics.demo.models.Student;
import com.ics.demo.models.StudentPrac;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "prac", url = "http://10.55.8.28/api", configuration = FeignConfig.class)
public interface FeignPrac  {
    //All students
    @RequestMapping(method = RequestMethod.GET, value = "students")
    List<StudentPrac> getAllStudents();

    //Registering a student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    StudentPrac createStudent(@RequestBody StudentPrac studentPrac);

    @RequestMapping(method = RequestMethod.POST, value = "{unitId}/enroll/{studentId}")
    StudentPrac enrollStudent(@PathVariable(name = "unitId") long id, @PathVariable(name = "studentId") long sid);

    @RequestMapping(method = RequestMethod.POST, value = "{unitId}/validate/{enrollmentKey}")
    StudentPrac validate(@PathVariable(name = "unitId") long id, @PathVariable(name = "enrollementKey") long eid);



}
