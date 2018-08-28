package com.abcdpower.riskcontrol.zxjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ZxjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxjtApplication.class, args);
    }
}
