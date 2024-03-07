package com.example.OneToMany.college.controller;

import com.example.OneToMany.college.model.Department;
import com.example.OneToMany.college.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class Departmentcontroller {
    @Autowired
    private Departmentservice departmentService;

    @PostMapping("/")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(Departmentservice.SaveDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return Departmentservice.findAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return Departmentservice.findDepartmentById(id);
    }

    @GetMapping("/college/{collegeName}")
    public List<Department> getDepartmentsByCollegeName(@PathVariable String collegeName) {
        return Departmentservice.findDepartmentsByCollegeName(collegeName);
    }
}