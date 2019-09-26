package com.ics.demo.models;

public class MockStudent {
    private Long id;
    private  String studentNumber;
    private String firstname;

    public MockStudent(String studentNumber, String firstname) {
        this.studentNumber = studentNumber;
        this.firstname = firstname;
    }

    public MockStudent() {
    }

    @Override
    public String toString() {
        return "MockStudent{" +
                "id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
