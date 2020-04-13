package com.yaroslavambrozyak.chatapp.controller;

import com.yaroslavambrozyak.chatapp.dto.MessageDTO;
import com.yaroslavambrozyak.chatapp.model.Chat;
import com.yaroslavambrozyak.chatapp.model.Message;
import com.yaroslavambrozyak.chatapp.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @GetMapping
    public String mainChatPage(Model model) {
        List<Message> messagesMock = new ArrayList<>();
        Message message = new Message();
        message.setText("heello");
        messagesMock.add(message);
        Message message1 = new Message();
        message1.setText("hello2");
        messagesMock.add(message1);

        List<Chat> chats = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Chat chat = new Chat();
            chat.setId(String.valueOf(i));
            chat.setTitle("chat" + i);
            chats.add(chat);
        }

        model.addAttribute("chats", chats);

        model.addAttribute("messages", messagesMock);
        return "main";
    }

    @GetMapping("/chats/{id}/messages")
    public String getChat(@PathVariable("id") String chatId,
                          @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
                          @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
                          Model model) {
        model.addAttribute("messages", chatService.getMessages(chatId, page, size));
        return "/fragments/chat-fragment";
    }

    @PostMapping("/chat/{id}/messages")
    public void postMessage(@PathVariable("id") String chatId,
                            @RequestBody MessageDTO messageDTO) {
        chatService.addMessage(chatId, messageDTO);
    }
}
