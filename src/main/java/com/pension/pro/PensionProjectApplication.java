package com.pension.pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.pension.pro.dao")
/*开启事务*/
@EnableTransactionManagement
public class PensionProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PensionProjectApplication.class, args);
    }

}
