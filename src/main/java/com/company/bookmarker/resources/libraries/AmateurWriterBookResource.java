package com.company.bookmarker.resources.libraries;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.services.libraries.AmateurWriterBookService;

@RestController
@RequestMapping(value = "/amateurWriterBook")
@Resource
public class AmateurWriterBookResource {

    @Autowired
    private AmateurWriterBookService amateurWriterBookService;

    @GetMapping
    public ResponseEntity<List<com.company.bookmarker.entities.libraries.AmateurWriterBook>> findAll() {
        return ResponseEntity.ok(amateurWriterBookService.findAll());
    }

    @GetMapping
    public ResponseEntity<com.company.bookmarker.entities.libraries.AmateurWriterBook> findById(@PathVariable Long id) {
        return ResponseEntity.ok(amateurWriterBookService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AmateurWriterBook> save(@RequestBody AmateurWriterBook amateurWriterBook) {
        amateurWriterBook = amateurWriterBookService.save(amateurWriterBook);
        amateurWriterBookService.save(amateurWriterBook);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(amateurWriterBook.getId()).toUri();
        return ResponseEntity.created(uri).body(amateurWriterBook);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        amateurWriterBookService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<AmateurWriterBook> update(@PathVariable Long id,@RequestBody AmateurWriterBook amateurWriterBook) {
    	amateurWriterBook = amateurWriterBookService.update(id, amateurWriterBook);
    	return ResponseEntity.ok(amateurWriterBook);
    }

}
