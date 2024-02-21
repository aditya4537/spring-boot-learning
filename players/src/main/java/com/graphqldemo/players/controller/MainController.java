package com.graphqldemo.players.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.graphqldemo.players.model.Player;
import com.graphqldemo.players.service.PlayerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final PlayerService playerService;
    
    @QueryMapping
    public List<Player> findAll(){
        return playerService.findAllPlayers();
    }

    @QueryMapping
    public Player findOne(@Argument int playerId){
        return playerService.findPlayer(playerId);
    }

    @MutationMapping
    public Player create(@Argument("input") Player player){
        return playerService.addPlayer(player);
    }

    @MutationMapping
    public Player update(@Argument("input") Player player){
        return playerService.updatPlayer(player);
    }

    @MutationMapping
    public Player delete(@Argument int playerId){
        return playerService.deletePlayer(playerId);
    }
}
