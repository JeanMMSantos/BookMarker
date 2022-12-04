package com.company.bookmarker.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.bookmarker.entities.users.PaidUser;

public interface PaidUserRepository extends JpaRepository<PaidUser, Long> {
    
}
