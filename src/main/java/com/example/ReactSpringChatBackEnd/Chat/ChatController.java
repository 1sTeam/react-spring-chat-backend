package com.example.ReactSpringChatBackEnd.Chat;

import com.example.ReactSpringChatBackEnd.Common.dto.ResponseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

    @GetMapping("/dev")
    public ResponseEntity<ResponseMessage> dev(){

        ResponseChat.test responseDto = ResponseChat.test.builder()
                .nickname("닉네임")
                .build();

        ResponseMessage response = ResponseMessage.builder()
                .message("테스트 성공")
                .data(responseDto)
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}

