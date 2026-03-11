package org.example.messengerlivechat.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.messengerlivechat.chat.dto.Message;
import org.example.messengerlivechat.chat.dto.MessageType;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {

    private final SimpMessageSendingOperations messagingTemplate;

    public void handleWebSocketDisconnectListener(SessionDisconnectEvent disconnectEvent) {
       StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(disconnectEvent.getMessage());
       String username = (String) headerAccessor.getSessionAttributes().get("username");
         if (username != null) {
             log.info("User Disconnected: {}", username);
                var message = Message.builder()
                        .type(MessageType.LEAVE)
                        .sender(username)
                        .build();
                messagingTemplate.convertAndSend("/topic/public", message);
         }
    }
}
