package com.sunyo.wlpt.consigneeconsigner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.sunyo.wlpt.consigneeconsigner.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ConsigneeconsignerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsigneeconsignerApplication.class, args);
    }

}
