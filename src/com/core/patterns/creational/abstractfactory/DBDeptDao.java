package com.core.patterns.creational.abstractfactory;

public class DBDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("DBDept");
    }
}
