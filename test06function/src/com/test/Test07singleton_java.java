package com.test;

public class Test07singleton_java {
    public static void main(String[] args) {
        System.out.println("java singleton");

//        Test07MySingleton t1 = new Test07MySingleton();
//        Test07MySingleton t2 = new Test07MySingleton();

        Test07MySingleton t1 = Test07MySingleton.getInstance();
        Test07MySingleton t2 = Test07MySingleton.getInstance();
        System.out.println("t1:"+t1.hashCode());
        System.out.println("t2:"+t2.hashCode());
    }
}
