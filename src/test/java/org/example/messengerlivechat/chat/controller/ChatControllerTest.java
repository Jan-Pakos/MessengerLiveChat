package org.example.messengerlivechat.chat.controller;

import org.example.messengerlivechat.chat.service.ChatRoomService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ChatControllerTest {

    @Mock
    private ChatRoomService chatRoomService;

    @InjectMocks
    private ChatRoomController chatRoomController;

    @Test
    void should_return_room_when_get_request_sent_with_room_id() {
        // given
        String roomId = "123";
        when(chatRoomService.getRoom(roomId)).thenReturn("Room ID: " + roomId);

        // when
        String result = chatRoomController.getChatRooms(roomId);

        // then
        assertEquals("Room ID: 123", result);
        verify(chatRoomService).getRoom(roomId);
    }
}
