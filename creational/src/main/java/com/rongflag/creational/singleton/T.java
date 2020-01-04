package com.rongflag.creational.singleton;

public class T implements Runnable {
    public void run() {
        LazySingleTon instance = LazySingleTon.getInstance();
        System.out.println(Thread.currentThread().getName() +" :" + instance);
    }
}
