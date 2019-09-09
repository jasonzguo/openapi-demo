package com.github.jasonzguo.openapidemo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.github.jasonzguo.openapidemo.domain.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
    public Player findByName(String name);
    public List<Player> findByClub(String club);
}
