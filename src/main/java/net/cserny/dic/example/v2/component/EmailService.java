package net.cserny.dic.example.v2.component;

public class EmailService implements MessageService {
    public void sendMessage(String message, String recipient) {
        // logic to send email
        System.out.println(String.format("Email sent to %s with message = %s", recipient, message));
    }
}
