package com.rongflag.creational.singleton;

public class LazySingleTon {
    private static LazySingleTon lazySingleTon = null;

    private LazySingleTon(){}

    public static  LazySingleTon getInstance(){
        synchronized (LazySingleTon.class){
            if(lazySingleTon  == null){
                lazySingleTon = new LazySingleTon();
            }
        }
        return lazySingleTon;
    }

}
