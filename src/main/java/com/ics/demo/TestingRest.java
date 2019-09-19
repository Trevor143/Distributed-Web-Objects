package com.ics.demo;

import com.ics.demo.models.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//this is a must
@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {
        // feign
        List<University> universities = feignRestClient.getAllUniverisities();
        System.out.println("Feign Universities"+universities.toString());

        // post 1 uni using feign
        University createdUniversity = feignRestClient.createUniversity(new University("Tujiangalie University","Africa"));
        System.out.println("created university "+createdUniversity);

        // find by id
        University findUni = feignRestClient.findById(createdUniversity.getId());
        System.out.println("Uni is "+findUni);

        // update on server
        createdUniversity.setLocation("Sauti sol");
        University updatedUniversity = feignRestClient.update(createdUniversity.getId(),createdUniversity);
    }
}
