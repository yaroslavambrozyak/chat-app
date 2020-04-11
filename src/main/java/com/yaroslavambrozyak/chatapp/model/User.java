package com.yaroslavambrozyak.chatapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Document("user")
public class User {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

}
