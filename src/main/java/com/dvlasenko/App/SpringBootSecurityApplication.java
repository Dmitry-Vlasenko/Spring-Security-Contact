package com.dvlasenko.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootSecurityApplication {

    private static final Logger LOGGER =
            Logger.getLogger(SpringBootSecurityApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityApplication.class, args);
        LOGGER.info("APP is running...");
    }
}
