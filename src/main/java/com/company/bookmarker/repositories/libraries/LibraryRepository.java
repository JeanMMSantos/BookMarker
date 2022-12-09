package com.company.bookmarker.repositories.libraries;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.bookmarker.entities.libraries.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}

