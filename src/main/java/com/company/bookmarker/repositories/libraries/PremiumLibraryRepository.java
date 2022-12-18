package com.company.bookmarker.repositories.libraries;

import com.company.bookmarker.entities.libraries.PremiumLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PremiumLibraryRepository extends JpaRepository<PremiumLibrary, UUID> {
}
