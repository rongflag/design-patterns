package com.rongflag.creational.factorymethod;

/**
 * @author : aihuxi
 * @version V1.0
 * @Project: design-patterns
 * @Package com.rongflag.creational.factorymethod
 * @Description: TODO
 * @email worongbo@163.com
 * @date 2020年01月04日 14:46
 */
public class PythonVideoFactory extends ViedoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
