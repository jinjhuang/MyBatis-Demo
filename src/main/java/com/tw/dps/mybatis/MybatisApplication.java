package com.tw.dps.mybatis;

import com.tw.dps.mybatis.controller.ApiController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tw.dps.mybatis.dao")
public class MybatisApplication {

    public static void main(String[] args) {
        ApiController apiController = new ApiController();
        SpringApplication.run(MybatisApplication.class, args);
        System.out.println(apiController.getApiById(1));
    }
}
