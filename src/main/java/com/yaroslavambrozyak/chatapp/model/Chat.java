package com.yaroslavambrozyak.chatapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Document("chat")
public class Chat {

    @Id
    private String id;
    private LocalDateTime createdAt;
    private String title;
    private List<Message> messages;
    private List<UUID> members;

    public Chat(String title, List<UUID> members) {
        this.title = title;
        this.members = members;
    }

}
