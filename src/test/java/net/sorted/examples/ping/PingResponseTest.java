package net.sorted.examples.ping;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PingResponseTest {

    @Test
    public void testMessage() {
        PingResponse r = new PingResponse("msg");
        assertEquals("msg", r.getMessage());

    }
}
