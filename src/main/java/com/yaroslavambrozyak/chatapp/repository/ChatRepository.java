package com.yaroslavambrozyak.chatapp.repository;

import com.yaroslavambrozyak.chatapp.model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ChatRepository extends MongoRepository<Chat, UUID> {


}
