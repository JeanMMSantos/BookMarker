package com.company.bookmarker.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.bookmarker.entities.users.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
