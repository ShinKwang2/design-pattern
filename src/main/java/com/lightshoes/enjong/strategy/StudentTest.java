package com.lightshoes.enjong.strategy;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100, false);
        studentLee.addSubject("수학", 100, true);
        studentLee.addSubject("채플", 80, null);


        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 55, true);
        studentKim.addSubject("수학", 55, false);
        studentKim.addSubject("영어", 100, false);
        studentKim.addSubject("채플", 20, null);


        studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();

    }
}
