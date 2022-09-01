
package com.chriswork.app.RestGUIDSpring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chriswork.app.RestGUIDSpring.Model.Administrator;

public interface AdminRepo extends JpaRepository<Administrator, Long> {
    
}
