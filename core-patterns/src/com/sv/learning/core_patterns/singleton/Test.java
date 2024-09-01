package com.sv.learning.core_patterns.singleton;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        System.out.println(dateUtil1 == dateUtil2);

        DateUtilEagerInitialization dateUtilEagerInitialization1 = DateUtilEagerInitialization.getInstance();
        DateUtilEagerInitialization dateUtilEagerInitialization2 = DateUtilEagerInitialization.getInstance();

        System.out.println(dateUtilEagerInitialization1 == dateUtilEagerInitialization2);

        DateUtilEagerInitializationStaticBlock dateUtilEagerInitializationStaticBlock1 = DateUtilEagerInitializationStaticBlock.getInstance();
        DateUtilEagerInitializationStaticBlock dateUtilEagerInitializationStaticBlock2 = DateUtilEagerInitializationStaticBlock.getInstance();

        System.out.println(dateUtilEagerInitializationStaticBlock1 == dateUtilEagerInitializationStaticBlock2);

        DateUtil dateUtil3 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:\\Projects\\java-design-patterns\\resources\\singleton\\dateUtil.ser")));
        oos.writeObject(dateUtil3);

        DateUtil dateUtil4 = null;
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream(new File("E:\\Projects\\java-design-patterns\\resources\\singleton\\dateUtil.ser")));
        dateUtil4 = (DateUtil) ios.readObject();

        oos.close();
        ios.close();

        System.out.println(dateUtil3 == dateUtil4);
    }

}
