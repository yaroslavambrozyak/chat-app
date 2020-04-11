package com.yaroslavambrozyak.chatapp.repository;

import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MongoChatModifyRepositoryImpl implements MongoChatModifyRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public void addUser(String chatId, String userId) {
        Update update = new Update();
        update.push("members", userId);
        Criteria criteria = Criteria.where("id").is(chatId);
        mongoTemplate.updateFirst(Query.query(criteria), update, Chat.class);
    }

    @Override
    public void addMessage(String chatId, Message message) {
        Update update = new Update();
        update.push("messages", message);
        Criteria criteria = Criteria.where("id").is(chatId);
        mongoTemplate.updateFirst(Query.query(criteria), update, Chat.class);
    }
}
