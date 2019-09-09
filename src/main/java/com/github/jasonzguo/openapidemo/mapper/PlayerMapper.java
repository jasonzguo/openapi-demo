package com.github.jasonzguo.openapidemo.mapper;

import org.mapstruct.Mapper;

import com.github.jasonzguo.openapidemo.domain.Player;
import com.github.jasonzguo.openapidemo.model.User;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    default User playerToUser(Player source) {
        User user = new User();
        String[] names = source.getName().split(" ");
        user.setFirstName(names[0]);
        user.setLastName(names.length > 1 ? names[1] : "");
        user.setEmail(
                String.format(
                        "%s@%s.com",
                        source.getName().replace(" ", "").toLowerCase(),
                        source.getClub().replace(" ", "").toLowerCase()
                )
        );
        return user;
    }
}
