package com.ving.testlog.test;

import org.apache.log4j.Logger;

public class Log4jTest {

    static final Logger LOGGER = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        LOGGER.info("log4j demo");
    }
}
