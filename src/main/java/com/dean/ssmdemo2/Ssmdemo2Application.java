package com.dean.ssmdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dean.ssmdemo2.mapper")
public class Ssmdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ssmdemo2Application.class, args);
    }


}
