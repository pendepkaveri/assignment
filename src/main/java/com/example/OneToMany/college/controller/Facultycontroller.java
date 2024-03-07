package com.example.OneToMany.college.controller;

import com.example.OneToMany.college.model.Faculty;
import com.example.OneToMany.college.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class Facultycontroller {
    @Autowired
    private Facultyservice facultyService;
    @PostMapping("/")
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        return new ResponseEntity<>(facultyService.saveFaculty(faculty), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<Faculty> getAllFaculties() {
        return facultyService.findAllFaculties();
    }

    @GetMapping("/department/{departmentName}")
    public List<Faculty> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        return facultyService.findFacultiesByDepartmentName(departmentName);
    }


}


