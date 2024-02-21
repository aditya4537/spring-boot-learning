package com.graphqldemo.players.service;

import java.util.List;

import com.graphqldemo.players.model.Player;

public interface PlayerService {
    
    public List<Player> findAllPlayers();
    
    public Player findPlayer(int id);

    public Player addPlayer(Player player);

    public Player deletePlayer(int id);

    public Player updatPlayer(Player player);
}
