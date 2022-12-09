package com.company.bookmarker.resources.libraries;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.company.bookmarker.entities.libraries.PremiumLibrary;
import com.company.bookmarker.services.libraries.PremiumLibraryService;

import java.net.URI;@RestController
@RequestMapping(value = "/premiumLibrary")
@Resource
public class PremiumLibraryResource {
    @Autowired
    private PremiumLibraryService premiumLibraryService;


    @PostMapping
    public ResponseEntity<PremiumLibrary> save(@RequestBody PremiumLibrary premiumLibrary){
        premiumLibrary = premiumLibraryService.save(premiumLibrary);
        premiumLibraryService.save(premiumLibrary);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(premiumLibrary.getId()).toUri();
        return ResponseEntity.created(uri).body(premiumLibrary);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        premiumLibraryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
