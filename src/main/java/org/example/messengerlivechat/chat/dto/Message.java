package org.example.messengerlivechat.chat.dto;

import lombok.*;

import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {

    private String content;
    private String sender;
    private MessageType type;
}
