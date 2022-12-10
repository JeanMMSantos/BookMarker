package com.company.bookmarker.repositories.libraries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookApiRepository extends JpaRepository<AmateurWriterBook, Long> {
}
