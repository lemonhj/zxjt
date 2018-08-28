package com.abcdpower.riskcontrol.zxjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.abcdpower.riskcontrol.zxjt.dao")
public class ZxjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxjtApplication.class, args);
    }
}
