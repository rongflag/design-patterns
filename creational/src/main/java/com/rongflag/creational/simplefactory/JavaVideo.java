package com.rongflag.creational.simplefactory;

/**
 * @author : aihuxi
 * @version V1.0
 * @Project: design-patterns
 * @Package com.rongflag.creational.simplefactory
 * @Description: TODO
 * @email worongbo@163.com
 * @date 2020年01月04日 13:46
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("创建JAVA 视频");
    }
}
