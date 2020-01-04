package com.rongflag.creational.buider;

public abstract class CouseBuider {
    public abstract void buiderCourseName(String courseName);
    public abstract void buiderCoursePPT(String coursePPT);
    public abstract void buiderCourseVideo(String courseVideo);
    public abstract void buiderCourseArticle(String courseArticle);
    public abstract void buiderCourseQA(String courseQA);

    public abstract Course buider();
}

