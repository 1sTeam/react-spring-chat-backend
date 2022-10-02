package com.example.ReactSpringChatBackEnd.Chat;

import lombok.Builder;
import lombok.Data;

import java.util.List;

public class ResponseRoom {

    @Builder
    @Data
    public static class create{
        private String uuid;
        private String name;
    }

    @Builder
    @Data
    public static class delete{
        private String message;
    }

    @Builder
    @Data
    public static class info{
        private List<>;
    }
}
