package com.test;

public class Test07MySingleton {
    private static Test07MySingleton instance = null;

    private Test07MySingleton(){

    }

    public static synchronized Test07MySingleton getInstance(){
        if(instance == null){
            instance = new Test07MySingleton();
        }
        return instance;
    }
}
