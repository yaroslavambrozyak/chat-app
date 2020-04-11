package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.dto.SignInDTO;
import com.yaroslavambrozyak.chatapp.dto.SignUpDTO;

public interface AuthenticationService {

    void performSingIn(SignInDTO signInDTO);

    void performSingUp(SignUpDTO signUpDTO);
}
