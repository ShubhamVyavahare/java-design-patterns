package com.sv.learning.core_patterns.abstractfactory;

public class DBEmpDao implements Dao {


    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }

}
