package org.example.messengerlivechat;

import org.springframework.boot.SpringApplication;

public class TestMessengerLiveChatApplication {

    public static void main(String[] args) {
        SpringApplication.from(MessengerLiveChatApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
