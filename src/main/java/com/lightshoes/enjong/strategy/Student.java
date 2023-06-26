package com.lightshoes.enjong.strategy;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String name;
    private List<Subject> subjects;

    private static final int BASIC = 0;
    private static final int MAJOR = 1;
    private static final int PASS = 2;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;

        subjects = new ArrayList<>();
    }

    public void addSubject(String name, int score, Boolean majorCode) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjects.add(subject);
    }

    public void showGradeInfo() {

        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation(), (point -> {
            if (point >= 70) {
                return "PASS";
            }
            return "FAIL";
        })};

        for (Subject subject : subjects) {
            int score = subject.getScorePoint();

            String grade;
            if (subject.isMajorCode() == null) {
                grade = gradeEvaluations[PASS].getGrade(score);
            }
            else if (subject.isMajorCode() == true) {
                grade = gradeEvaluations[MAJOR].getGrade(score);
            }
            else {
                grade = gradeEvaluations[BASIC].getGrade(score);
            }

            System.out.println("학생 " + name + "의 " + subject.getName() + " 과목 성적은 " +
                    subject.getScorePoint() + "점 이고, 학점은 " + grade +" 입니다.");
        }
    }
}
