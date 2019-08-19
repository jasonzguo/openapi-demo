package com.github.jasonzguo.openapidemo.controller;

import com.github.jasonzguo.openapidemo.api.UsersApi;
import com.github.jasonzguo.openapidemo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersRestController implements UsersApi {

    @Override
    public ResponseEntity<List<User>> usersGet() {
        User userJason = new User();
        userJason.setFirstName("Jason");
        userJason.setLastName("Guo");
        userJason.setEmail("jason.guo@email.com");

        List<User> users = new ArrayList<User>();
        users.add(userJason);

        return ResponseEntity.ok(users);
    }

}
