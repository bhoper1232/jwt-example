package com.bhoper.jwtexample;

import com.bhoper.jwtexample.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class JwtExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtExampleApplication.class, args);
    }
}
