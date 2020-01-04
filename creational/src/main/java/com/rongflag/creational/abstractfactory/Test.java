package com.rongflag.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        CourseFacory javaCourseFactory = new JavaCourseFactory();
        Video javaVideo = javaCourseFactory.getVideo();
        javaVideo.produce();
        Article javaArticle = javaCourseFactory.getArticle();
        javaArticle.produce();

        CourseFacory pythonCourseFatory = new PythonCourseFactory();
        Article pythonArticle = pythonCourseFatory.getArticle();
        pythonArticle.produce();
        Video pythonVideo = pythonCourseFatory.getVideo();
        pythonVideo.produce();
    }
}
