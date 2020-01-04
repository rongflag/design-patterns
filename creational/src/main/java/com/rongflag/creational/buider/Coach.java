package com.rongflag.creational.buider;

public class Coach {

    private CouseBuider couseBuider;

    public void setCouseBuider(CouseBuider couseBuider) {
        this.couseBuider = couseBuider;
    }

    public Course buiderCourse(String courseName,String courseArticle,String courseVideo,String CoursePPT,String courseQA){
        this.couseBuider.buiderCourseName(courseName);
        this.couseBuider.buiderCourseArticle(courseArticle);
        this.couseBuider.buiderCourseVideo(courseVideo);
        this.couseBuider.buiderCoursePPT(CoursePPT);
        this.couseBuider.buiderCourseQA(courseQA);
        return this.couseBuider.buider();
    }
}
