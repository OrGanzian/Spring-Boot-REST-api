package com.organ.repository;

import com.organ.model.Player;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PlayerRepository implements ObjectRepository<Player,String> {


    private Map<String,Player> map;

    public PlayerRepository() {
        this.map = new HashMap();
        map.put("omri", new Player("ganzian"));
        map.put("or",new Player("ganzian"));
        map.put("dima",new Player("khmelev"));
        map.put("toni",new Player("kroos"));
    }

    @Override
    public Player store(Player player) {
        this.map.put(player.getLastName(), player);
        return player;
    }



    @Override
    public Player retrieveById(String name) {
        return this.map.get(name);
    }

    @Override
    public Player search(String name) {
        return null;
    }

    @Override
    public Player delete(String name) {
        return null;
    }

    @Override
    public List<Player> getAll() {
        return new ArrayList<Player>(map.values());
    }


}
