package com.example.ReactSpringChatBackEnd.Common.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseMessage {
    private String message;
    private Object data;
}
