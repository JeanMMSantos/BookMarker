package com.company.bookmarker.services;

import com.company.bookmarker.entities.libraries.PremiumLibrary;
import com.company.bookmarker.repositories.libraries.PremiumLibraryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PremiumLibraryService {
    final PremiumLibraryRepository premiumLibraryRepository;

    public PremiumLibraryService(PremiumLibraryRepository premiumLibraryRepository) {
        this.premiumLibraryRepository = premiumLibraryRepository;
    }

    @Transactional//Notação para métodos construtivos/destrutivos
    public PremiumLibrary save(PremiumLibrary premiumLibrary){
        return premiumLibraryRepository.save(premiumLibrary);
    }

    public List<PremiumLibrary> findAll(){
        return premiumLibraryRepository.findAll();
    }

    public Optional<PremiumLibrary> findById(UUID id) {
        return premiumLibraryRepository.findById(id);
    }

    @Transactional
    public void delete(PremiumLibrary premiumLibrary) {
        premiumLibraryRepository.delete(premiumLibrary);
    }
}