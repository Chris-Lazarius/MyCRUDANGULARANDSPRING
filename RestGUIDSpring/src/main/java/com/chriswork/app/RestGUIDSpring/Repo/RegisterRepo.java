
package com.chriswork.app.RestGUIDSpring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chriswork.app.RestGUIDSpring.Model.Register;


public interface RegisterRepo extends JpaRepository<Register, Long> {
    
}
