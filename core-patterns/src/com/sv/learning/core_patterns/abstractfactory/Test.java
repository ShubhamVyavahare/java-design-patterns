package com.sv.learning.core_patterns.abstractfactory;

public class Test {

    public static void main(String[] args) {

        DaoAbstractFactory daf1 = DaoFactoryProducer.produce("xml");
        Dao dao1 = daf1.createDao("emp");
        dao1.save();

        DaoAbstractFactory daf2 = DaoFactoryProducer.produce("xml");
        Dao dao2 = daf2.createDao("dept");
        dao2.save();

        DaoAbstractFactory daf3 = DaoFactoryProducer.produce("db");
        Dao dao3 = daf3.createDao("emp");
        dao3.save();

        DaoAbstractFactory daf4 = DaoFactoryProducer.produce("db");
        Dao dao4 = daf4.createDao("dept");
        dao4.save();

    }

}
