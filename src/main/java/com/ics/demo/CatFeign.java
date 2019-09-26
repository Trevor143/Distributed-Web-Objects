package com.ics.demo;

import com.ics.demo.models.CatStudent;
import com.ics.demo.models.Match;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "catclient" , url = "http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface CatFeign  {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    CatStudent regStudent(@RequestBody CatStudent student);
//
//    @RequestMapping(method = RequestMethod.GET, value = "students")
//    CatStudent getStudent(@RequestParam(name = "studentNumber")String studentNumber);
//    @RequestMapping(method = RequestMethod.GET, value = "matches")
//    CatStudent getMatches();
    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Match matchstudent(@RequestParam (name = "gender") String gender, @RequestParam (name = "studentId") Long sid);

    @RequestMapping(method = RequestMethod.PATCH, value = "matches/{dateId}")
//    Match updateMatch(@RequestBody Match match, @PathVariable(name = "dateId") Long dateId);
    Match updateMatch(@RequestBody Match match, @PathVariable(name = "dateId") Long dateId);
//
    @RequestMapping(method = RequestMethod.PUT, value = "dates/{dateID}")
    Match requestMatch(@PathVariable (name = "dateID") Long dateID, @RequestParam (name = "matchId") Long matchId, @RequestParam (name = "studentId") Long sid);


}
