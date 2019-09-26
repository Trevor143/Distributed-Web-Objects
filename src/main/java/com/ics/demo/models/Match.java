package com.ics.demo.models;

public class Match {
    Long studentId;
    String reason;

    public Match(Long studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Match{" +
                "studentId=" + studentId +
                ", reason='" + reason + '\'' +
                '}';
    }
}
