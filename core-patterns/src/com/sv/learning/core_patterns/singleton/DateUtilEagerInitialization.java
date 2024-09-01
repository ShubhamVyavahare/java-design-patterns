package com.sv.learning.core_patterns.singleton;

public class DateUtilEagerInitialization {

    private static DateUtilEagerInitialization instance = new DateUtilEagerInitialization();

    private DateUtilEagerInitialization() {
    }

    public static DateUtilEagerInitialization getInstance() {
        return instance;
    }
}
