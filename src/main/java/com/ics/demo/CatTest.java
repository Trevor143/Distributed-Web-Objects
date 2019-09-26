package com.ics.demo;

import com.ics.demo.models.CatStudent;
import com.ics.demo.models.Match;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CatTest implements CommandLineRunner {
    private final CatFeign catFeign;

    public CatTest(CatFeign catFeign) {
        this.catFeign = catFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("running");

//        CatStudent student = catFeign.regStudent(new CatStudent("94919","Trevor"));

        //32
        Match match = catFeign.matchstudent("FEMALE",(long) 32);
//        System.out.println(match);
        //Match id =17
        catFeign.updateMatch(new Match(32l,"We can go out I think"),(long) 52);

        catFeign.requestMatch((long)52,(long) 17,(long) 32);
    }
}
