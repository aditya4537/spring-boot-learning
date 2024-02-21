package com.graphqldemo.players.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.graphqldemo.players.model.Player;
import com.graphqldemo.players.repository.PlayerRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepo playerRepo;

    @Override
    public List<Player> findAllPlayers() {
        return playerRepo.findAll();
    }

    @Override
    public Player findPlayer(int id) {
        return playerRepo.getById(id);
    }

    @Override
    public Player addPlayer(Player player) {
        // Player p = new Player();
        // p.setPlayerId(id);
        // p.setPlayerName(name);
        // p.setTeam(team);
        // p.setAge(age);
        // p.setRuns(runs);
        System.err.println(player);
        return playerRepo.save(player);
    }

    @Override
    public Player deletePlayer(int id) {
        Player player = findPlayer(id);
        playerRepo.deleteById(id);
        return player;
    }

    @Override
    public Player updatPlayer(Player player) {
        // Player p = new Player();
        // p.setPlayerId(id);
        // p.setPlayerName(name);
        // p.setTeam(team);
        // p.setAge(age);
        // p.setRuns(runs);
        return playerRepo.save(player);
    }
    
}
