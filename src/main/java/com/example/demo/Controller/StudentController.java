package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class Studct1{
    @Autowired 
    private StudentService ser;
    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity st){
        return ser.saveData(st);
    }
    @GetMapping("/getail")
    public StudentEntity getStudentById(@PathVariable int id){
        return ser.getById(id);
    }
    @PutMapping("/update/{id}")
    public StudentEntity updateStudent( @PathVAriable int id,@RequestBody StudentEntity st){
        return ser.update(id,st);
    }

}