package com.rongflag.creational.buider.v2;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA) {
        this.courseName = courseName;
        this.coursePPT = coursePPT;
        this.courseVideo = courseVideo;
        this.courseArticle = courseArticle;
        this.courseQA = courseQA;
    }

    public  Course(CourseBuider buider){
        this.courseArticle = buider.courseArticle;
        this.courseName = buider.courseName;
        this.coursePPT = buider.coursePPT;
        this.courseQA = buider.courseQA;
        this.courseVideo = buider.courseVideo;
    }




    public static class CourseBuider{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuider buiderCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBuider buiderCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuider buiderCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        } public CourseBuider buiderCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }
        public CourseBuider buiderCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }

        public Course buider(){
//            return new Course(courseName,coursePPT,courseVideo,courseArticle,courseQA);
            return new Course(this);
        }


    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("版本22：：：")
                .append("courseName", courseName)
                .append("coursePPT", coursePPT)
                .append("courseVideo", courseVideo)
                .append("courseArticle", courseArticle)
                .append("courseQA", courseQA)
                .toString();
    }
}
