package com.practice.adlister.dao;

import com.practice.adlister.models.User;

import java.util.List;

public interface Users {
    User findByUsername(String username);
    Long insert(User user);
}