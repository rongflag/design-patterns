package com.rongflag.creational.factorymethod;

/**
 * @author : aihuxi
 * @version V1.0
 * @Project: design-patterns
 * @Package com.rongflag.creational.simplefactory
 * @Description: 测试类
 * @email worongbo@163.com
 * @date 2020年01月04日 13:47
 * java.util.Calendar#createCalendar(java.util.TimeZone, java.util.Locale)
 */
public class Test {

    public static void main(String[] args) {
        JavaVideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video video1 = pythonVideoFactory.getVideo();
        video1.produce();
    }
}
