package com.company.bookmarker.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.bookmarker.entities.users.FreeUser;

public interface FreeUserRepository extends JpaRepository<FreeUser, Long>{
    
}
