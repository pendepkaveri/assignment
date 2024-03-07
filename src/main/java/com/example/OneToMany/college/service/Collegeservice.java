package com.example.OneToMany.college.service;

import com.example.OneToMany.college.Repository.Collegerepo;
import com.example.OneToMany.college.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class Collegeservice {
        @Autowired
        private Collegerepo collegeRepository;


    public College saveCollege(College college) {
        return college;
    }

    public List<College> findAllColleges() {
        return null;
    }

    public College findCollegeById(Long id) {
        return null;
    }

    public void deleteCollegeById(Long id) {
    }
}


