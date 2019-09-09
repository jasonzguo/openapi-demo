package com.github.jasonzguo.openapidemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "players")
public class Player {

    @Id
    private String id;

    @Field("Name")
    @TextIndexed(weight=6)
    private String name;

    @Field("Club")
    private String club;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Player() {}

    public Player(String name, String club) {
        super();
;       this.name = name;
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', club='%s']",
                id, name, club);
    }
}
