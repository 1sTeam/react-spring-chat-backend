package com.example.ReactSpringChatBackEnd.Auth;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

public class RequestAuth {
    @Builder
    @Data
    public static class register{
        private String email;
        private String password;
        private String username;
    }

    @Builder
    @Data
    public static class login{
        private String email;
        private String password;
    }

    @Builder
    @Data
    public static class update{
        private String password;
        private String username;
    }
}
