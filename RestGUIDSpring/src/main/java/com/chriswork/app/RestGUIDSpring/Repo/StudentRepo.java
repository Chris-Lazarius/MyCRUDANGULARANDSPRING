package com.chriswork.app.RestGUIDSpring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chriswork.app.RestGUIDSpring.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
    
}
