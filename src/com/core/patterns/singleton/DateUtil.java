package com.core.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;

//    static { // at the time of loading the class into memory
//        instance = new DateUtil();
//    }
    private DateUtil() {}

    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() { // fixing de-serialization issue
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
