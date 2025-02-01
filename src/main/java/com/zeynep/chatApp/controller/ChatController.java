package com.zeynep.chatApp.controller;

import org.springframework.stereotype.Controller;

import com.zeynep.chatApp.model.ChatMessage;

@Controller
public class ChatController {

    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }
}
