package com.sample.springbootdemo.controller;

import com.sample.springbootdemo.model.StudentModel;
import com.sample.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
@CrossOrigin("http://localhost:5173")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("add")//GET http://localhost:8081/students/add
    public ResponseEntity<StudentModel> insert(@RequestBody StudentModel model){
        return new ResponseEntity<>(service.insertNewStudent(model),HttpStatus.CREATED);
    }

    @PutMapping("update")//POST http://localhost:8081/students/update
    public ResponseEntity<StudentModel> updateStudent(@RequestBody StudentModel model){
        return new ResponseEntity<>(service.updateStudentDetails(model),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("delete")//DELETE http://localhost:8081/students/delete?studentId=5{any id can be used}
    public ResponseEntity<StudentModel> deleteStudent(@RequestParam Integer studentId){
        return new ResponseEntity<>(service.deleteStudentDetails(studentId),HttpStatus.ACCEPTED);
    }
    @GetMapping("one")//GET http://localhost:8081/students/one/5
    public ResponseEntity<StudentModel> viewOneStudent(@RequestParam Integer studentId){
        return new ResponseEntity<>(service.viewOneStudent(studentId),HttpStatus.OK);
    }
    @GetMapping("all")// http://localhost:8081/students/all
    public ResponseEntity<List<StudentModel>> viewAllStudent(){
        return new ResponseEntity<>(service.viewAllStudents(),HttpStatus.OK);
    }
}
