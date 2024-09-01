package com.sv.learning.core_patterns.singleton;

public class LoggerSingletonTest {

    public static void main(String[] args) {

        LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();

        loggerSingleton.log("Logger Singleton !!!");

    }

}
