package com.core.patterns.abstractfactory;

public class DBDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("DBDept");
    }
}
