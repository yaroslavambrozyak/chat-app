package com.yaroslavambrozyak.chatapp.builder;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public class ChatBuilder {

    private String title;
    private List<String> membersId = new ArrayList<>();

}
