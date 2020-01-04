package com.rongflag.creational.abstractfactory;

public class PythonCourseFactory implements CourseFacory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
