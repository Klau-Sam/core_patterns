package com.core.patterns.creational.abstractfactory;

public class XMLDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("XMLDept");
    }
}
