package com.core.patterns.abstractfactory;

public class DBEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("DBEmp");
    }
}
