package com.company.bookmarker.resources.libraries;


import com.company.bookmarker.dtos.PremiumLibraryDto;
import com.company.bookmarker.entities.libraries.PremiumLibrary;
import com.company.bookmarker.services.libraries.PremiumLibraryService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/premium-library")
@Resource
public class PremiumLibraryResource {
    final PremiumLibraryService premiumLibraryService;

    public PremiumLibraryResource(PremiumLibraryService premiumLibraryService) {
        this.premiumLibraryService = premiumLibraryService;
    }

    @PostMapping
    public ResponseEntity<Object> savePremiumLibrary(@RequestBody PremiumLibraryDto premiumLibraryDto){
        var premiumLibrary = new PremiumLibrary();
        BeanUtils.copyProperties(premiumLibraryDto, premiumLibrary);
        return ResponseEntity.status(HttpStatus.CREATED).body(premiumLibraryService.save(premiumLibrary));
    }

    @GetMapping
    public ResponseEntity<List<PremiumLibrary>> getAllPremiumLibraries(){
        return ResponseEntity.status(HttpStatus.OK).body(premiumLibraryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOnePremiumLibrary(@PathVariable(value = "id") UUID id){
        Optional<PremiumLibrary> premiumLibraryOptional = premiumLibraryService.findById(id);
        if(!premiumLibraryOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lista não encontrada.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(premiumLibraryOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePremiumLibrary(@PathVariable(value = "id") UUID id){
        Optional<PremiumLibrary> premiumLibraryOptional = premiumLibraryService.findById(id);
        if(!premiumLibraryOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lista não encontrada.");
        }
        premiumLibraryService.delete(premiumLibraryOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Lista deletada com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePremiumLibrary(@PathVariable(value = "id") UUID id,
                                                       @RequestBody PremiumLibraryDto premiumLibraryDto ){
        Optional<PremiumLibrary> premiumLibraryOptional = premiumLibraryService.findById(id);
        if(!premiumLibraryOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lista não encontrada.");
        }
        var premiumLibrary = new PremiumLibrary();
        BeanUtils.copyProperties(premiumLibraryDto, premiumLibrary);
        premiumLibrary.setId(premiumLibraryOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(premiumLibraryService.save(premiumLibrary));
    }
}
