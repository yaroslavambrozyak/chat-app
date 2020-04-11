package com.yaroslavambrozyak.chatapp.controller;

import com.yaroslavambrozyak.chatapp.dto.SignInDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {

    @GetMapping("/auth")
    public String authenticationPage() {
        return "";
    }

    @PostMapping("/sign-in")
    public String performSingIn(SignInDTO signInDTO) {

        return "redirect:/me";
    }

    @PostMapping("/sing-up")
    public String performSingUp() {
        return "redirect:/auth";
    }
}
