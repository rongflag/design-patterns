package com.rongflag.creational.buider.v2;

import com.google.common.collect.ImmutableSet;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuider().buiderCourseName("课程名称")
                .buiderCourseArticle("课程手记").buiderCoursePPT("ppt").buiderCourseQA("问答").buiderCourseVideo("视频")
                .buider();
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("c").build();
        set.add("m");

    }
}
