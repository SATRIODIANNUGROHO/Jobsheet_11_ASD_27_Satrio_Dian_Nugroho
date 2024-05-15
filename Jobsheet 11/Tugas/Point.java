package com.jobsheet11.tugas;
public class Point {
    private int pointId;
    private String question;
    private String answer;
    private Point nextPoint;
    public Point(int pointId, String question, String answer) {
        this.pointId = pointId;
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
    }
    public int getPointId() {
        return pointId;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public Point getNextPoint() {
        return nextPoint;
    }
    public void setNextPoint(Point nextPoint) {
        this.nextPoint = nextPoint;
    }
}