package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.builder.ChatBuilder;
import com.yaroslavambrozyak.chatapp.model.Chat;

import java.util.List;

public interface ChatService {

    Chat create(ChatBuilder chatBuilder);

    Chat getOneById(String id);

    List<Chat> getAllByMemberId(String memberId);
}
