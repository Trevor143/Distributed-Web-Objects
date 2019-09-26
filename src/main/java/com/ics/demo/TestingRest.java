package com.ics.demo;

import com.ics.demo.models.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//this is a must
//@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;
    private final MockFeignClient mockFeignClient;

    public TestingRest(FeignRestClient feignRestClient, MockFeignClient mockFeignClient) {
        this.feignRestClient = feignRestClient;
        this.mockFeignClient = mockFeignClient;
    }


    @Override
    public void run(String... args) throws Exception {
        // feign
//        List<University> universities = feignRestClient.getAllUniverisities();
//        System.out.println("Feign Universities"+universities.toString());
//
//        // post 1 uni using feign
//        University createdUniversity = feignRestClient.createUniversity(new University("Tujiangalie University","Africa"));
//        System.out.println("created university "+createdUniversity);
//
//        // find by id
//        University findUni = feignRestClient.findById(createdUniversity.getId());
//        System.out.println("Uni is "+findUni);
//
//        // update on server
//        createdUniversity.setLocation("Sauti sol");
//        University updatedUniversity = feignRestClient.update(createdUniversity.getId(),createdUniversity);

        MockStudent student = mockFeignClient.student(new MockStudent("94919","Trevor"));
//        System.out.println("Student Created: "+student);


    }
}
