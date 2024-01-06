package com.core.patterns.abstractfactory;

public class XMLDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("XMLDept");
    }
}
