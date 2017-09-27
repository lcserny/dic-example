package net.cserny.dic.example.v1;

public class EmailService {
    public void sendEmail(String message, String receiver) {
        // logic to send email
        System.out.println(String.format("Email sent to %s with message = %s", receiver, message));
    }
}
