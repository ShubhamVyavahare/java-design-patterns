package com.sv.learning.core_patterns.singleton;

public class TestEnumSingleton {

    public static void main(String[] args) {

        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;

        System.out.println(instance.getName());

        instance.setName("Shubham");

        System.out.println(instance.getName());

    }

}
