package net.sorted.examples.ping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({ @PropertySource(value = "classpath:application.properties"),
@PropertySource(value = "file:./config/application.properties", ignoreResourceNotFound = true) })
public class PingApp {

	private static Logger log = LogManager.getLogger(PingApp.class);
	
	public static void main(String[] args) {
        log.debug("Initializing the ping application");
        try {
            SpringApplication.run(PingApp.class, args);
            log.debug("ping is up and running");
        } catch (Throwable t) {
            log.error("Failed to start ping", t);
            System.exit(1);
        }

	}

}
