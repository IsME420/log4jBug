package com.andootown.log4jbug;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author andootown
 * @Date 2021/12/10 20:32
 * @Version:1.0
 * @Description〈〉
 */
@SpringBootApplication
public class Log4jBugApplication {
    public static final Logger LOG = LogManager.getLogger(Log4jBugApplication.class);
    public static void main(String[] args) {
        LOG.info("hello world");
        SpringApplication.run(Log4jBugApplication.class, args);
    }
}
