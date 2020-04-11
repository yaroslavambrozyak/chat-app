package com.yaroslavambrozyak.chatapp.model;

import com.yaroslavambrozyak.chatapp.dto.MessageDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Message {

    private String messageId;
    private LocalDateTime createdAt;
    private String text;

    public static Message of(MessageDTO messageDTO) {
        Message message = new Message();
        message.messageId = UUID.randomUUID().toString();
        message.text = messageDTO.getText();
        message.createdAt = LocalDateTime.now();
        return message;
    }

}
