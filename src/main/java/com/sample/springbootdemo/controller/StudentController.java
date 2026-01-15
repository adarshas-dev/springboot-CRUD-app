package com.sample.springbootdemo.controller;

import com.sample.springbootdemo.model.StudentModel;
import com.sample.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("add")
    public ResponseEntity<StudentModel> insert(@RequestBody StudentModel model){
//        return studentService.insertNewStudent(model);
        return new ResponseEntity<>(studentService.insertNewStudent(model), HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<List<StudentModel>> viewAllStudents(){
        return new ResponseEntity<>(studentService.viewAllStudents(), HttpStatus.OK);
    }

    @GetMapping("one/{studentId}")
    public ResponseEntity<StudentModel> viewOneStudent(@PathVariable Integer studentId){
        return new ResponseEntity<>(studentService.viewOneStudent(studentId), HttpStatus.OK);
    }
}
