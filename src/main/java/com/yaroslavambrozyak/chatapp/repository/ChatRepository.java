package com.yaroslavambrozyak.chatapp.repository;

import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatRepository extends MongoRepository<Chat, String>, MongoChatModifyRepository {

    @Query(value = "{members: ?0}", fields = "{messages:0, members:0}")
    List<Chat> findAllByMemberId(String memberId);

    @Query("{id:{?0}}")
    Optional<Chat> findByIdWithPageableMessage(String chatId, Integer messagePage, Integer messageSize);

    @Query(fields = "{messages: {$slice:[?1,?2]}}", value = "{id:?0}")
    Chat findChatMessages(String chatId, int page, int size);
}
