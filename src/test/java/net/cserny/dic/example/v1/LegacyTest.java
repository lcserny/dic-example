package net.cserny.dic.example.v1;

import org.junit.Test;

public class LegacyTest {
    @Test
    public void testProcessMessage() throws Exception {
        MyApplication application = new MyApplication();
        application.processMessage("Hi there", "leo@test.com");
    }
}
