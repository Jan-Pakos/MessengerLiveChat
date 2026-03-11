package org.example.messengerlivechat;

import org.example.messengerlivechat.chat.service.ChatRoomService;
import org.example.messengerlivechat.chat.web.ChatRoomController;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest(classes = {ChatRoomController.class, ChatRoomService.class})
class MessengerLiveChatApplicationTests {

    @Test
    void context_loads() {

    }

}
