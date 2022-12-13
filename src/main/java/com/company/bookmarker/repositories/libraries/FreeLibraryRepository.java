package com.company.bookmarker.repositories.libraries;


import com.company.bookmarker.entities.libraries.FreeLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FreeLibraryRepository extends JpaRepository<FreeLibrary, UUID> {
}
