package com.sample.springbootdemo.controller;

import com.sample.springbootdemo.model.StudentModel;
import com.sample.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student") //to make the url common word for identification http://localhost:8080/student/...

public class StudentController {
    @Autowired //declare object once and call it many times, to access object
    StudentService studentService;

    @PostMapping("add")
    public ResponseEntity<StudentModel> insert(@RequestBody StudentModel model){//json type is converted to object model and stored in model
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

    @PutMapping("update")
    public ResponseEntity<StudentModel> updateStudent(@RequestBody StudentModel model){
        return new ResponseEntity<>(studentService.updateStudentDetails(model), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("delete")
    public ResponseEntity<StudentModel> deleteStudent(@RequestParam Integer studentId){
        return new ResponseEntity<>(studentService.deleteStudentDetails(studentId), HttpStatus.ACCEPTED);
    }
//    http://localhost:8080/delete?studentId=2

//    @DeleteMapping("delete/{studentId}")
//    public ResponseEntity<StudentModel> deleteStudent(@PathVariable Integer studentId){
//        return new ResponseEntity<>(studentService.deleteStudentDetails(studentId), HttpStatus.ACCEPTED);
//    }
//    http://localhost:8080/delete/2
}
