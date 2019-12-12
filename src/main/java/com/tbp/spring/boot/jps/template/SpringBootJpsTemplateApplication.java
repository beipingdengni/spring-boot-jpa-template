package com.tbp.spring.boot.jps.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableJpaRepositories
public class SpringBootJpsTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpsTemplateApplication.class, args);
    }

}
