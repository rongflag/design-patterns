package com.rongflag.creational.factorymethod;

/**
 * @author : aihuxi
 * @version V1.0
 * @Project: design-patterns
 * @Package com.rongflag.creational.simplefactory
 * @Description: TODO
 * @email worongbo@163.com
 * @date 2020年01月04日 13:46
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("创建 python 视频");
    }
}
