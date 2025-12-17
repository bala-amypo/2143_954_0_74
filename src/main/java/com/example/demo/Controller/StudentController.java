package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studentity;
import com.example.demo.service.Studservice;

@RestController
@RequestMapping("/student")
public class Studct1{
    @Autowired 
    private Studservice ser;
    @PostMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);
    }
    @GetMapping("/getail")
    public Studentity getStudentById(@PathVariable int id){
        return ser.getById(id);
    }
    @PutMapping("/update/{id}")
    public Studentity updateStudent( @PathVAriable int id,@RequestBody Studentity st){
        return ser.update(id,st);
    }

}