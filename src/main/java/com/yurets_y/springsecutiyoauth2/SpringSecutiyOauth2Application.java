package com.yurets_y.springsecutiyoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringSecutiyOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecutiyOauth2Application.class, args);
    }

}
