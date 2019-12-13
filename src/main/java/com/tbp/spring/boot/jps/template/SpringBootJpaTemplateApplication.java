package com.tbp.spring.boot.jps.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableJpaRepositories
public class SpringBootJpaTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaTemplateApplication.class, args);
    }

}
