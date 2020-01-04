package com.rongflag.creational.buider;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Course {
    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    private String courseQA;

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("courseName", courseName)
                .append("coursePPT", coursePPT)
                .append("courseVideo", courseVideo)
                .append("courseArticle", courseArticle)
                .append("courseQA", courseQA)
                .toString();
    }
}

