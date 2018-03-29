package com.webstore2.controller;

import com.webstore2.domain.User;
import com.webstore2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public final class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/save")
    public List<User> saveUsers() {
        return userService.addUser();
    }
}
