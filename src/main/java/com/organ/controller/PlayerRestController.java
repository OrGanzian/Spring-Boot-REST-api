package com.organ.controller;

import com.organ.model.Player;
import com.organ.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PlayerRestController {


    @Autowired
    PlayerService playerService;



    @GetMapping("/players/{firstName}")
    public String getPlayerInfo(@PathVariable("firstName") String firstName) {
        return playerService.getPlayerByName(firstName).getLastName();
    }

    @RequestMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }


    // POST


    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player playerInput) {
        return playerService.addPlayer(playerInput);
    }


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
