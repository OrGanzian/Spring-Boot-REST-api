package com.organ.controller;

import com.organ.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlayerRestController {


    @Autowired
    PlayerService playerService;



    @GetMapping("/player/{firstName}")
    public String getPlayerInfo(@PathVariable("firstName") String firstName) {
        return playerService.getPlayerByName(firstName).getLastName();
    }

    @RequestMapping("/players")
    public String getAllPlayers() {
        return "Hello";
    }


    // POST


//    @RequestMapping("/results")
//    public List<Result> getAllResult() {
//        List<Result> resultsToReturn = new ArrayList<>();
//        resultsToReturn.add(new Result(1));
//        resultsToReturn.add(new Result(5));
//        resultsToReturn.add(new Result(8));
//        return resultsToReturn;
//    }


    // PUT


    //    @RequestMapping("/results")
//    public List<Result> getAllResult() {
//        List<Result> resultsToReturn = new ArrayList<>();
//        resultsToReturn.add(new Result(1));
//        resultsToReturn.add(new Result(5));
//        resultsToReturn.add(new Result(8));
//        return resultsToReturn;
//    }


    // DELETE

//    @RequestMapping("/results")
//    public List<Result> getAllResult() {
//        List<Result> resultsToReturn = new ArrayList<>();
//        resultsToReturn.add(new Result(1));
//        resultsToReturn.add(new Result(5));
//        resultsToReturn.add(new Result(8));
//        return resultsToReturn;
//    }


}
