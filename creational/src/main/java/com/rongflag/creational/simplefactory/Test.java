package com.rongflag.creational.simplefactory;

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
//        Video video = new JavaVideo();
//        video.produce();
        ViedoFactory viedoFactory = new ViedoFactory();
        Video video = viedoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();

        Video video1 = viedoFactory.getVideo(PythonVideo.class);
        video1.produce();

    }
}
