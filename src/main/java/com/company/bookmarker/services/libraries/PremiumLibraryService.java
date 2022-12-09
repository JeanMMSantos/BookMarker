package com.company.bookmarker.services.libraries;

import com.company.bookmarker.repositories.libraries.PremiumLibraryRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.bookmarker.entities.libraries.PremiumLibrary;


@Service
public class PremiumLibraryService {
    @Autowired
    private PremiumLibraryRepository premiumLibraryRepository;

    public PremiumLibrary save(PremiumLibrary premiumLibrary){
        return premiumLibraryRepository.save(premiumLibrary);
    }

    public void delete(Long id) {
        premiumLibrary.deleteById(id);
    }

    public PremiumLibrary update(Long id, PremiumLibrary premiumLibrary){
        @SuppressWarnings("deprecation")
        PremiumLibrary entity = premiumLibraryRepository.getById(id);
        updateData(entity, premiumLibrary);
        return premiumLibraryRepository.save(entity);
    }

    private void updateData(PremiumLibrary entity, PremiumLibrary premiumLibrary){
        entity.setName (premiumLibrary.getName());
        entity.setTheme (premiumLibrary.getTheme());

    }
}
