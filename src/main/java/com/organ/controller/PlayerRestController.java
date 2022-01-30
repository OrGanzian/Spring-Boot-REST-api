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
    public Player getPlayerInfo(@PathVariable("firstName") String firstName) {
        return playerService.getPlayerByName(firstName);
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


    @PostMapping("/players/{lastName}")
    public Player editPlayer(@RequestBody Player playerInput,@PathVariable String lastName) {
        return playerService.editPlayer(lastName, playerInput);
    }


    // DELETE

    @DeleteMapping("/players/{lastName}")
    public String deletePlayer(@PathVariable("lastName") String playerNameToDelete) {
        return playerService.deletePlayer(playerNameToDelete);
    }


}
