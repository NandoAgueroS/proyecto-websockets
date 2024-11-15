package com.proyectowebsockets.proyecto_web_sockets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ChatController {

    @GetMapping("/")
    public String showChatPage(){
        return "chat";
    }
}
