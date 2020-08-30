package com.ving.logbackdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogbackDemo {
    static final Logger LOGGER = LogManager.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        LOGGER.info("logback demo");
    }
}
