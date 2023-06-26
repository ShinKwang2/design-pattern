package com.lightshoes.enjong.strategy;

public class Subject {

    private String name;
    private Integer scorePoint;
    private Boolean majorCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(Integer scorePoint) {
        this.scorePoint = scorePoint;
    }

    public Boolean isMajorCode() {
        return majorCode;
    }

    public void setMajorCode(Boolean majorCode) {
        this.majorCode = majorCode;
    }
}
