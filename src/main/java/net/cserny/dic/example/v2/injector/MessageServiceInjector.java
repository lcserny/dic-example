package net.cserny.dic.example.v2.injector;

import net.cserny.dic.example.v2.consumer.Consumer;

public interface MessageServiceInjector {
    Consumer getConsumer();
}
