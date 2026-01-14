package com.sample.springbootdemo.model;

public class StudentModel {
    private Integer studentId;
    private String studentName;
    private Integer studentAge;
    private String studentPlace;

    public StudentModel() {
    }

    public StudentModel(Integer studentId, String studentName, Integer studentAge, String studentPlace) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPlace = studentPlace;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPlace() {
        return studentPlace;
    }

    public void setStudentPlace(String studentPlace) {
        this.studentPlace = studentPlace;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentPlace='" + studentPlace + '\'' +
                '}';
    }
}
