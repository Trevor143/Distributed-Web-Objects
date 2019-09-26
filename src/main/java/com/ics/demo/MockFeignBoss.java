package com.ics.demo;

import com.ics.demo.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "boss", url = "http://localhost:1000")
public interface MockFeignBoss {

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);

//    @RequestMapping(method = RequestMethod.POST, value = "appointments")
//    Appointment createAppointment(@RequestBody CreateAppointmentDto createAppointmentDto);

//    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{id}")
//    Appointment confirm (@PathVariable Long id, @RequestParam Long studentId);
}
