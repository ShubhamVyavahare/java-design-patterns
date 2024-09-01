package com.sv.learning.core_patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;

    private DateUtil() {
    }

    // This is lazy initialisation, only executed when called
    public static DateUtil getInstance() {

        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null)
                    instance = new DateUtil();
            }
        }

        return instance;
    }

    // This is to resolve de-serialization problem
    protected Object readResolve() {
        return instance;
    }

    // To avoid clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
