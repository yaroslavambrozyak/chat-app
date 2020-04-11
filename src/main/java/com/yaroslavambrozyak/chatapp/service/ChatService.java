package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.dto.MessageDTO;
import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.model.Message;

import java.util.List;

public interface ChatService {

    Chat create(Chat chat);

    Chat getOneById(String id);

    List<Chat> getAllByMemberId(String memberId);

    Chat getById(String id, Integer messagePage, Integer messageSize);

    void addUser(String chatId, String userId);

    void removeUser(String chatId, String userId);

    void addMessage(String chatId, MessageDTO message);

    List<Message> getMessages(String chatId, int page, int size);
}
