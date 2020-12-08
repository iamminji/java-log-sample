package com.example.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {

    private static final Logger LOG = LoggerFactory.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        System.out.println("Start to LoggerExample");
        LOG.info("########## INFO");
        LOG.error("########### ERROR");
        System.out.println("Start to LoggerExample");
    }

}
