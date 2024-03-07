package com.example.OneToMany.college.Repository;


import com.example.OneToMany.college.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Collegerepo extends JpaRepository<College, Long> {
}