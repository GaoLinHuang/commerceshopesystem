package com.koalin.commerceshopesystem.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.koalin.commerceshopesystem.user.mapper")
public class CommerceshopesystemUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceshopesystemUserApplication.class, args);
    }

}
