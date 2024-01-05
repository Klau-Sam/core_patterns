package com.core.patterns.singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("dateUtil.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();
        System.out.println(dateUtil1 == dateUtil2);

        Logger logger = Logger.getInstance();
        logger.log("Hello world!");
    }
}
