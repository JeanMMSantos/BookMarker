package com.company.bookmarker.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.bookmarker.entities.users.AmateurWriter;

public interface AmateurWriterRepository extends JpaRepository<AmateurWriter, Long>{
    
}
