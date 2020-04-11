package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByEmail(String email);

}
