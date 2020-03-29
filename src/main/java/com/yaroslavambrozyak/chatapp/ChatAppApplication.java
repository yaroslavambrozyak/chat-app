package com.yaroslavambrozyak.chatapp;

import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class ChatAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChatAppApplication.class, args);
    }

    @Autowired
    ChatRepository chatRepository;

    @Override
    public void run(String... args) throws Exception {
        Chat chat = new Chat();
        chat.setCreatedAt(LocalDateTime.now());
        Chat save = chatRepository.save(chat);
        System.out.println(save);
    }
}
