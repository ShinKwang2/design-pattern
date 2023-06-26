package com.lightshoes.enjong.strategy;

public class MajorEvaluation implements GradeEvaluation {

    @Override
    public String getGrade(int point) {

        if (95 <= point && point <= 100) {
            return "S";
        }
        if (90 <= point && point <= 94) {
            return "A";
        }
        if (80 <= point && point <= 89) {
            return "B";
        }
        if (70 <= point && point <= 79){
            return "C";
        }
        if (60 <= point && point <= 69) {
            return "D";
        }
        return "F";
    }
}
