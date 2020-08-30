package com.ving;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {

    static final Logger LOGGER = LogManager.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
        LOGGER.info("log4j2 demo");
    }
}
