package main.java.net.sorted.examples.ping;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({ @PropertySource(value = "classpath:application.properties"),
@PropertySource(value = "file:./config/application.properties", ignoreResourceNotFound = true) })
public class PingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
