package com.company.bookmarker.repositories.libaries;

import com.company.bookmarker.entities.libaries.AmateurWriterBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookApiRepository extends JpaRepository<AmateurWriterBook, Long> {
}
