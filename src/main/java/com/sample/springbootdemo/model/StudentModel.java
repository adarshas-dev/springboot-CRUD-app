package com.sample.springbootdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_age")
    private Integer studentAge;
    @Column(name = "student_place")
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
