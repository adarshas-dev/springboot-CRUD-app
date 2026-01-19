package com.sample.springbootdemo.service;

import com.sample.springbootdemo.exceptions.AgeNotValidException;
import com.sample.springbootdemo.model.StudentModel;
import com.sample.springbootdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;

    @Override
    public StudentModel insertNewStudent(StudentModel model) {
        if(model.getStudentAge() < 18){
//            throw new RuntimeException("Student age must be greater than 18");
            throw new AgeNotValidException("Student age must be greater than 18");
        }
        return repository.save(model);
    }

    @Override
    public List<StudentModel> viewAllStudents() {
        return repository.findAll();
    }

    @Override
    public StudentModel viewOneStudent(Integer studentId) {

        Optional<StudentModel> op = repository.findById(studentId);
        if (!op.isEmpty()) {
            return op.get();
        }
        return new StudentModel();
    }

    @Override
    public StudentModel updateStudentDetails(StudentModel model) {
        Optional<StudentModel> op = repository.findById(model.getStudentId());
        if (!op.isEmpty()) {
            return repository.save(model);
        }
        return new StudentModel();
    }

    @Override
    public StudentModel deleteStudentDetails(Integer studentId) {
        Optional<StudentModel> op = repository.findById(studentId);
        if (!op.isEmpty()) {
            repository.deleteById(studentId);
            return op.get();
        }
        return new StudentModel();
    }


}
