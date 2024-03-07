package com.example.OneToMany.college.service;

import com.example.OneToMany.college.Repository.Departmentrepo;
import com.example.OneToMany.college.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Departmentservice {
    @Autowired
    private Departmentrepo departmentRepository;


    public static List<Department> findDepartmentsByCollegeName(String collegeName) {
        return null;
    }

    public static List<Department> findAllDepartments() {
        return null;
    }

    public static Department findDepartmentById(Long id) {
        return null;
    }

    public static Department SaveDepartment(Department department) {
        return department;
    }
}

