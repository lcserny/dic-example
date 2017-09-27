package net.cserny.dic.example.v1;

public class MyApplication {
    private EmailService emailService = new EmailService();

    public void processMessage(String message, String recipient) {
        // do some message validation, manipulation logic, etc.
        emailService.sendEmail(message, recipient);
    }
}
