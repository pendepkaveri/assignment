package com.example.OneToMany.college.Repository;


import com.example.OneToMany.college.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Departmentrepo extends JpaRepository<Department, Long> {
}