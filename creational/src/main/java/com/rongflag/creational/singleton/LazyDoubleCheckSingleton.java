package com.rongflag.creational.singleton;

public class LazyDoubleCheckSingleton {
    // 增加 volatile 不会重排序 就
    private volatile static LazyDoubleCheckSingleton singleton = null;
    // 防止反射破坏

    private LazyDoubleCheckSingleton(){
        // 如果先初始化了就不会再进去了
        if(singleton != null) {
            throw  new RuntimeException("已经初始化了，禁止在用反射构建");
        }
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(singleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new LazyDoubleCheckSingleton();
                    // 1. 分配内存
                    // 2. 初始化对象
                    // 3.设置singleton 指向刚刚分配的内存地址
                    // 这2，3有可能重排序，顺序不一定
                }
            }
        }
        return singleton;
    }
}
