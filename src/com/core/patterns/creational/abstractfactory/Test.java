package com.core.patterns.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("XML");
        Dao dao = daf.createDao("emp");
        dao.save();
    }
}
