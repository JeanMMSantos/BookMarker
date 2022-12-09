package com.company.bookmarker.repositories.libraries;

import com.company.bookmarker.entities.libraries.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PremiumLibraryRepository extends JpaRepository<Library, Long> {
}

