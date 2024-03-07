package com.example.OneToMany.college.Repository;

import com.example.OneToMany.college.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Facultyrepo extends JpaRepository<Faculty, Long> {
}