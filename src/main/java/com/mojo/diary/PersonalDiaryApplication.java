package com.mojo.diary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PersonalDiaryApplication {

    private static Logger logger = LoggerFactory.getLogger(PersonalDiaryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PersonalDiaryApplication.class, args);
        logger.info("PersonalDiary application started....");
    }
}
