package net.cserny.dic.example.v2.consumer;

public interface Consumer {
    void processMessage(String message, String recipient);
}
