package com.ics.demo;

import com.ics.demo.models.MockStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "mockclient", url = "http://10.55.7.71:1000/")
public interface MockFeignClient  {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent student(@RequestBody MockStudent Student);
}
