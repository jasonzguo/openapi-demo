package com.github.jasonzguo.openapidemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jasonzguo.openapidemo.domain.Player;
import com.github.jasonzguo.openapidemo.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> findByClub(String club) {
        return playerRepository.findByClub(club);
    }

}
