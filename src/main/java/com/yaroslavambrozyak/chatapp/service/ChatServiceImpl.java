package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.builder.ChatBuilder;
import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;

    @Override
    public Chat create(ChatBuilder chatBuilder) {
        return null;
    }

    @Override
    public Chat getOneById(String id) {
        return null;
    }

    @Override
    public List<Chat> getAllByMemberId(String memberId) {
        return null;
    }
}
