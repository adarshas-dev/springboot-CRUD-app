package com.sample.springbootdemo.service;

import com.sample.springbootdemo.model.StudentModel;

import java.util.List;

public interface StudentService {
    public StudentModel insertNewStudent(StudentModel model);
    public List<StudentModel> viewAllStudents();
    public StudentModel viewOneStudent(Integer studentId);
}


