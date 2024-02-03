package com.example.dailystudy.wildcard;

import org.springframework.context.support.ApplicationObjectSupport;

public class Course {

    // 모든 사람 등록 가능
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1 을 등록함.");
    }

    // 학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2 을 등록함.");
    }


    // 직장인 및 일반인만 등록 가능
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course3을 등록함.");
    }
}
