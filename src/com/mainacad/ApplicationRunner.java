package com.mainacad;

import com.mainacad.service.OneService;

import java.util.logging.Logger;

public class ApplicationRunner {
    public static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        LOGGER.info(OneService.methodOne() + "\n");
        LOGGER.info(OneService.methodTwo() + "\n");

    }
}
