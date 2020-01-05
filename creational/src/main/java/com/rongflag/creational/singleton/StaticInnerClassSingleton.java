package com.rongflag.creational.singleton;

/**
 * 基于类初始化的延迟加载解决方案
 */
public class StaticInnerClassSingleton {

    private static class Inner{
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return Inner.singleton;
    }
}
