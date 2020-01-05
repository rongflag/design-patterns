package com.rongflag.creational.singleton;

import java.io.Serializable;

/**
 * 实现序列化只是为了测试 需要根据真实的业务
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
        throw  new RuntimeException("禁止反射调用");
        /*if (singleton != null){
            throw  new RuntimeException("禁止反射调用");
        }*/
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

    /**
     * 防止反序列化攻击
     * ObjectInputStream 里面反射的调用方法吧
     * @return
     */
    private Object readResolve() {
        return singleton;
    }

}