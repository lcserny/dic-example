package net.cserny.dic.example.v2.injector;

import net.cserny.dic.example.v2.component.SmsService;
import net.cserny.dic.example.v2.consumer.Consumer;
import net.cserny.dic.example.v2.consumer.MyDiApplication;

public class SmsServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new MyDiApplication(new SmsService());
    }
}
