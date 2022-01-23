package com.organ.service;

import com.organ.model.Player;
import com.organ.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player getPlayerByName(String name) {
        return this.playerRepository.retrieve(name);
    }

}
