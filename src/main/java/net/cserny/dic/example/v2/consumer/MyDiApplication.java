package net.cserny.dic.example.v2.consumer;

import net.cserny.dic.example.v2.component.MessageService;

public class MyDiApplication implements Consumer {
    private MessageService messageService;

    public MyDiApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        // do some message validation, manipulation logic, etc.
        messageService.sendMessage(message, recipient);
    }
}
