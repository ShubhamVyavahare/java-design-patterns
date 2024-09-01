package com.sv.learning.core_patterns.singleton;

import java.io.Serializable;

public class LoggerSingleton implements Serializable,Cloneable {

    private static volatile LoggerSingleton instance;

    private LoggerSingleton() {

    }

    public static LoggerSingleton getInstance() {

        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null)
                    instance = new LoggerSingleton();
            }
        }

        return instance;
    }

    // To avoid clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // This is to resolve de-serialization problem
    protected Object readResolve() {
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

}
