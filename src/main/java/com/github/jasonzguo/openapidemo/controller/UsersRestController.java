package com.github.jasonzguo.openapidemo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.github.jasonzguo.openapidemo.api.UsersApi;
import com.github.jasonzguo.openapidemo.domain.Player;
import com.github.jasonzguo.openapidemo.mapper.PlayerMapper;
import com.github.jasonzguo.openapidemo.model.User;
import com.github.jasonzguo.openapidemo.service.PlayerService;


@RestController
public class UsersRestController implements UsersApi {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public ResponseEntity<List<User>> usersGet() {
        List<Player> players = playerService.findByClub("FC Barcelona");
        List<User> users = players.stream().map(player -> playerMapper.playerToUser(player)).collect(Collectors.toList());
        return ResponseEntity.ok(users);
    }

}
