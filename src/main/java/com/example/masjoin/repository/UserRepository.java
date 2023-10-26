package com.example.masjoin.repository;

import com.example.masjoin.entity.User;

import java.util.List;

public interface UserRepository {

    public List<User> getAllUser();
    public User getUserByUserId(int userId);
}
