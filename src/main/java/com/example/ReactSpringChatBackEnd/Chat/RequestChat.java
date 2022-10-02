package com.example.ReactSpringChatBackEnd.Chat;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

public class RequestChat {

    @Builder
    @Data
    public static class test{
        private String nickname;
    }

}
