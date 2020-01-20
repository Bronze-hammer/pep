package com.koala.pep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.koala.pep.mapper")
@SpringBootApplication
public class PepApplication {

    public static void main(String[] args) {
        SpringApplication.run(PepApplication.class, args);
    }

}
