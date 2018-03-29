package com.webstore2.service;

import com.webstore2.domain.User;
import com.webstore2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private List<User> users = new ArrayList<>();

    public UserService() {
        User user = User.builder()
                .firstName("Bill")
                .lastName("Gates")
                .email("bill@gmail.com")
                .address("New Street, 6")
                .phoneNumber("+0043848832")
                .build();
        users.add(user);
    }

    public List<User> addUser() {
        return userRepository.saveAll(users);
    }
}
