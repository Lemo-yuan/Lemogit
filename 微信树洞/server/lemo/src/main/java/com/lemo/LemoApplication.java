package com.lemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: laojie
 * @Date: $(DATE) $(TIME)
 * @Version: 1.0
 */
@SpringBootApplication
@EnableScheduling
public class LemoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(LemoApplication.class, args);
    }

}
