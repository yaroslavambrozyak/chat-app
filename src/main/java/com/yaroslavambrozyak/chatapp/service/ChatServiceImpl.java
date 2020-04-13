package com.yaroslavambrozyak.chatapp.service;

import com.yaroslavambrozyak.chatapp.dto.MessageDTO;
import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.model.Message;
import com.yaroslavambrozyak.chatapp.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;

    @Override
    public Chat create(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public Chat getOneById(String id) {
        return chatRepository.findById(id).get();
    }

    @Override
    public List<Chat> getAllByMemberId(String memberId) {
        return chatRepository.findAllByMemberId(memberId);
    }

    @Override
    public Chat getById(String id, Integer messagePage, Integer messageSize) {
        return chatRepository.findByIdWithPageableMessage(id, messagePage, messageSize).get();
    }

    @Override
    public void addUser(String chatId, String userId) {
        chatRepository.addUser(chatId, userId);
    }

    @Override
    public void removeUser(String chatId, String userId) {

    }

    @Override
    public void addMessage(String chatId, MessageDTO messageDTO) {
        chatRepository.addMessage(chatId, Message.of(messageDTO));
    }

    @Override
    public List<Message> getMessages(String chatId, int page, int size) {
        Chat chatMessages = chatRepository.findChatMessages(chatId, page, size).orElseThrow(RuntimeException::new);
        return chatMessages.getMessages();
    }


}
