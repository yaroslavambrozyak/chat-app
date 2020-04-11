package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.model.User;
import com.yaroslavambrozyak.chatapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
