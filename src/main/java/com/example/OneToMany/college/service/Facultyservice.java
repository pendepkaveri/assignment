package com.example.OneToMany.college.service;

import com.example.OneToMany.college.Repository.Facultyrepo;
import com.example.OneToMany.college.model.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {
    @Autowired
    private Facultyrepo facultyRepository;


    public Faculty saveFaculty(Faculty faculty) {
        return faculty;
    }

    public List<Faculty> findAllFaculties() {
        return null;
    }

    public List<Faculty> findFacultiesByDepartmentName(String departmentName) {
        return null;
    }
}

