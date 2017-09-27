package net.cserny.dic.example.v2;

import net.cserny.dic.example.v2.consumer.Consumer;
import net.cserny.dic.example.v2.injector.EmailServiceInjector;
import net.cserny.dic.example.v2.injector.MessageServiceInjector;
import net.cserny.dic.example.v2.injector.SmsServiceInjector;
import org.junit.Test;

public class MyMessageDiTest {
    @Test
    public void testProcessMessageDi() throws Exception {
        String message = "Hi there";
        String recipient = "leo@test.com";
        MessageServiceInjector injector = null;
        Consumer application = null;

        // Send email
        injector = new EmailServiceInjector();
        application = injector.getConsumer();
        application.processMessage(message, recipient);

        // Send SMS
        injector = new SmsServiceInjector();
        application = injector.getConsumer();
        application.processMessage(message, recipient);
    }
}
