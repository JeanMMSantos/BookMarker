package com.company.bookmarker.resources.libraries;


import com.company.bookmarker.entities.libraries.FreeLibrary;
import com.company.bookmarker.services.libraries.FreeLibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/free-library")
@Resource
public class FreeLibraryResource {
    final FreeLibraryService freeLibraryService;

    public FreeLibraryResource(FreeLibraryService freeLibraryService) {
        this.freeLibraryService = freeLibraryService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getFreeLibrary(@PathVariable(value = "id") UUID id){
        Optional<FreeLibrary> freeLibraryOptional = freeLibraryService.findById(id);
        if(!freeLibraryOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lista não encontrada.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(freeLibraryOptional.get());
    }
}
