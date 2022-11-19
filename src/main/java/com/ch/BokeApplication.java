package com.ch;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ch.mapper")
@SpringBootApplication
public class BokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BokeApplication.class, args);
    }

}
