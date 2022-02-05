package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // fake user list

    List<User> userList = List.of(
            new User(1311L, "Durgesh Tiwari", "222333444555"),
            new User(1312L, "Ankit Tiwari", "356556544444"),
            new User(1313L, "Abhi Rajput", "989854554444"),
            new User(1314L, "Ravi Tiwari", "555888446677"),
            new User(1315L, "Sumona Tiwari", "66555338844")
    );

    @Override
    public User getUser(Long userId) {
        return userList.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
