package com.ics.demo;

import com.ics.demo.models.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
        RestTemplate restTemplate = new RestTemplate();

//        String baseUrl = "http://10.51.10.111:9090/";
//        ResponseEntity<List<University>> response = restTemplate.exchange(
//                baseUrl+"universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>() {});
//        List<University> universities = response.getBody();
//        System.out.println("Response: "+universities.toString());

        // feign
        List<University> universities = feignRestClient.getAllUniverisities();
        System.out.println("Feign Universities"+universities.toString());


//        University university = restTemplate.getForObject(
//                baseUrl+"universities/5",
//                University.class
//        );
//
//        String url = baseUrl+"universities/search?name="+university.getName();
//
//        University searched = restTemplate.getForObject(
//                url,
//                University.class
//        );

        // post 1 uni using feign
        University createdUniversity = feignRestClient.createUniversity(new University("Tujiangalie University","Africa"));
        System.out.println("created university "+createdUniversity);

        // find by id
        University findUni = feignRestClient.findById(createdUniversity.getId());
        System.out.println("Uni is "+findUni);
    }
}
