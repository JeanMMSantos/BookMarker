package com.company.bookmarker.services.libraries;

import com.company.bookmarker.entities.libraries.FreeLibrary;
import com.company.bookmarker.repositories.libraries.FreeLibraryRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class FreeLibraryService {
    final FreeLibraryRepository freeLibraryRepository;

    public FreeLibraryService(FreeLibraryRepository freeLibraryRepository) {
        this.freeLibraryRepository = freeLibraryRepository;
    }

    @Transactional//Notação para métodos construtivos/destrutivos

    public Optional<FreeLibrary> findById(UUID id) {
        return freeLibraryRepository.findById(id);
    }

}
