package com.organ.service;

import com.organ.model.Player;
import com.organ.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player getPlayerByName(String name) {
        return this.playerRepository.retrieveById(name);
    }

    public Player addPlayer(Player name) {
        return this.playerRepository.store(name);
    }

    public List<Player> getAllPlayers() {
        return this.playerRepository.getAll();
    }


}
