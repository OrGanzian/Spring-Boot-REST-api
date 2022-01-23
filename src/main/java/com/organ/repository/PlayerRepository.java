package com.organ.repository;

import com.organ.model.Player;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PlayerRepository implements ObjectRepository<Player> {


    private Map<String,Player> map;

    public PlayerRepository() {
        this.map = new HashMap();
        map.put("omri", new Player("ganzian"));
        map.put("or",new Player("ganzian"));
        map.put("dima",new Player("khmelev"));
        map.put("toni",new Player("kroos"));
    }

    @Override
    public void store(Player player) {

    }

    @Override
    public Player retrieve(String name) {
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


}
