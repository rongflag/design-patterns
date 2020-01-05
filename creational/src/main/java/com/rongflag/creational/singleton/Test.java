package com.rongflag.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
//        test1();
//        testSeriable();
//        testHungleClass();
//        testlazyClass();
        testEnum();
    }

    private static void testEnum() {
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();

    }


    /**
     * 测试懒加载 反射破坏
     */
    private static void testlazyClass() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        Class clz = LazyDoubleCheckSingleton.class;
        LazyDoubleCheckSingleton proxySingle = null;
        Constructor declaredConstructor = clz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        proxySingle = (LazyDoubleCheckSingleton) declaredConstructor.newInstance();
        Field field = clz.getDeclaredField("singleton");
        field.setAccessible(true);
        field.set(proxySingle,null);

        System.out.println(instance == proxySingle);


    }


    /**
     * 测试反射
     */
    private static void testHungleClass() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HungrySingleton instance = HungrySingleton.getInstance();
        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        Constructor[] declaredConstructors = hungrySingletonClass.getDeclaredConstructors();
        HungrySingleton newInstance = null ;
        for (Constructor constructor:
        declaredConstructors) {
            // 不看范围  public private
            constructor.setAccessible(true);
            newInstance = (HungrySingleton) constructor.newInstance();
        }
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }


    /**
     * 测试有反序列化破坏单例
     * 1. 首先该单例有序列化
     */
    private static void testSeriable() throws IOException, ClassNotFoundException {

        HungrySingleton instance = HungrySingleton.getInstance();
        //
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("hungrysingle_serial")));
        oos.writeObject(instance);
        //
        File hungrysingle_serial = new File("hungrysingle_serial");
        InputStream in;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(hungrysingle_serial));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }

    private static void test1() {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
    }
}
