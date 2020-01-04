package com.rongflag.creational.simplefactory;

/**
 * @author : aihuxi
 * @version V1.0
 * @Project: design-patterns
 * @Package com.rongflag.creational.simplefactory
 * @Description: 简单工厂类
 * @email worongbo@163.com
 * @date 2020年01月04日 13:54
 */
public class ViedoFactory {

    public Video getVideo(String type){
        if("JAVA".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return  null;
    }


    public  Video getVideo(Class clz){
        Video video = null;
        try {
            video = (Video) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  video;
    }
}
