package org.example.messengerlivechat.chat.web;

import lombok.AllArgsConstructor;
import org.example.messengerlivechat.chat.service.ChatRoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chat/rooms")
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    @GetMapping("/{roomId}")
    public String getChatRooms(@PathVariable String roomId) {
        return chatRoomService.getRoom(roomId);
    }
}