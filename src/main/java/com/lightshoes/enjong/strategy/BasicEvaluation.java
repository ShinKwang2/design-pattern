package com.lightshoes.enjong.strategy;

public class BasicEvaluation implements GradeEvaluation {

    @Override
    public String getGrade(int point) {

        if (90 <= point && point <= 100) {
            return "A";
        }
        if (80 <= point && point <= 89) {
            return "B";
        }
        if (70 <= point && point <= 79){
            return "C";
        }
        if (55 <= point && point <= 69) {
            return "D";
        }
        return "F";
    }
}
