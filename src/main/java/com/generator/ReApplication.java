package com.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.generator,entity")
public class ReApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReApplication.class, args);
    }

}
