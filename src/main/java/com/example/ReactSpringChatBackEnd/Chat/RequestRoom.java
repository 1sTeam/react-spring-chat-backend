package com.example.ReactSpringChatBackEnd.Chat;

import lombok.Builder;
import lombok.Data;

public class RequestRoom {

    @Builder
    @Data
    public static class create{
        private String name;
    }
}
