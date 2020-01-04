package com.rongflag.creational.buider;

public class Test {

    public static void main(String[] args) {
        Coach coach = new Coach();
        CouseBuider courseBuider = new FactCourseBuider();
        coach.setCouseBuider(courseBuider);
        Course course = coach.buiderCourse("课程名称", "课程手记", "课程视频", "课程video", "课程问答");
        System.out.println(course);
    }
}
