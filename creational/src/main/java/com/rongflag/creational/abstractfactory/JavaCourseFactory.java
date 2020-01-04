package com.rongflag.creational.abstractfactory;

public class JavaCourseFactory implements CourseFacory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
