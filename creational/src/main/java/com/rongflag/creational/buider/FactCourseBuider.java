package com.rongflag.creational.buider;

/**
 * <p>sdfasdas</p>
 */
public class FactCourseBuider extends CouseBuider {

    private Course course = new Course();

    public void buiderCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void buiderCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    public void buiderCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    public void buiderCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    public void buiderCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    public Course buider() {
        return course;
    }
}
