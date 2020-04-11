package com.yaroslavambrozyak.chatapp.repository;

import com.yaroslavambrozyak.chatapp.model.Message;

public interface MongoChatModifyRepository {

    void addUser(String chatId, String userId);

    void addMessage(String chatId, Message message);

}
