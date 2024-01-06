package com.core.patterns.abstractfactory;

public class XMLEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("XMLEmp");
    }
}
