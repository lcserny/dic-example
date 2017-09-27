package net.cserny.dic.example.v2.injector;

import net.cserny.dic.example.v2.component.EmailService;
import net.cserny.dic.example.v2.consumer.Consumer;
import net.cserny.dic.example.v2.consumer.MyDiApplication;

public class EmailServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new MyDiApplication(new EmailService());
    }
}
