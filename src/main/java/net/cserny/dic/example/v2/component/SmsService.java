package net.cserny.dic.example.v2.component;

public class SmsService implements MessageService {
    public void sendMessage(String message, String recipient) {
        // logic to send SMS
        System.out.println(String.format("SMS sent to %s with message = %s", recipient, message));
    }
}
