package net.cserny.dic.example.v2;

import net.cserny.dic.example.v2.component.MessageService;
import net.cserny.dic.example.v2.consumer.Consumer;
import net.cserny.dic.example.v2.consumer.MyDiApplication;
import net.cserny.dic.example.v2.injector.MessageServiceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyMessageDiMockTest {
    private MessageServiceInjector injector = Mockito.mock(MessageServiceInjector.class);

    @Before
    public void setUp() throws Exception {
        // mock injector with anonymous class
//        injector = new MessageServiceInjector() {
//            public Consumer getConsumer() {
//                return new MyDiApplication(new MessageService() {
//                    public void sendMessage(String message, String recipient) {
//                        System.out.println("Mock message service implementation");
//                    }
//                });
//            }
//        };

        // same thing using Mockito
        Mockito.when(injector.getConsumer()).thenReturn(new MyDiApplication(Mockito.mock(MessageService.class)));
    }

    @After
    public void tearDown() throws Exception {
        injector = null;
    }

    @Test
    public void testProcessMessageDiMock() throws Exception {
        Consumer application = injector.getConsumer();
        application.processMessage("a message", "a recipient");
    }
}
