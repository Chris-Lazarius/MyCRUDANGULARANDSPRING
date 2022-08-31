package com.chriswork.app.RestGUIDSpring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chriswork.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
    
}
