package com.company.bookmarker.resources.libraries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.services.users.AmateurWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/amateurWriterBook")
@Resource
public class AmateurWriterBookResource {

    @Autowired
    private AmateurWriterService amauterWriterService;

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


    public ResponseEntity<Void> delete(@PathVariable Long id) {
        amateurWriterBookService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
