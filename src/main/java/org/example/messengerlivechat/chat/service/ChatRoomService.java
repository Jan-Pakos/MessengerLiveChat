package org.example.messengerlivechat.chat.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ChatRoomService {
    public String getRoom(String roomId) {
        return "Room ID: " + roomId;
    }
}
