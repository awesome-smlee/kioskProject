package com.insilicogen.kioskproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class KioskProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KioskProjectApplication.class, args);
    }

}