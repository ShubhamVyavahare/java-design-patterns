package com.sv.learning.core_patterns.singleton;

public class DateUtilEagerInitializationStaticBlock {

    private static DateUtilEagerInitializationStaticBlock instance;

    static {
        instance = new DateUtilEagerInitializationStaticBlock();
    }

    private DateUtilEagerInitializationStaticBlock() {
    }

    public static DateUtilEagerInitializationStaticBlock getInstance() {
        return instance;
    }
}
