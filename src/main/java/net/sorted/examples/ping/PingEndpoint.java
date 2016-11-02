package net.sorted.examples.ping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class PingEndpoint {
	
	private Logger log = LogManager.getLogger(PingEndpoint.class);

    @RequestMapping(value="/api/ping", method = {RequestMethod.GET})
    public PingResponse ping(String input) {
        log.debug("Pinging input {}", input);
        return new PingResponse("Input " + input + " pinged");
    }
    
}
