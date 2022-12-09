package com.company.bookmarker.resources.libraries;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.bookmarker.entities.libraries.Library;

@RestController
@RequestMapping(value = "/librarie")
@Resource
public class LibrarieResource {
    @Autowired
    private Library library;

    @GetMapping
    public ResponseEntity<java.util.List<Library>> findAll() {
        return ResponseEntity.ok(Library.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Library> findById(@PathVariable Long id) {
        return ResponseEntity.ok(Library.findById(id));
    }
}