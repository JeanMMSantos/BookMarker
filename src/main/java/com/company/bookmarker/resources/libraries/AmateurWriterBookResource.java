package com.company.bookmarker.resources.libraries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.services.libraries.AmateurWriterBookService;
import com.company.bookmarker.services.users.AmateurWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;

@RestController
@RequestMapping(value = "/amateurWriterBook")
@Resource
public class AmauteurWriterBookService {

    @Autowired
    private AmateurWriterService amateurWriterService;

    @GetMapping
    public ResponseEntity<java.util.List<AmateurWriterBook>> findAll() {
        return ResponseEntity.ok(AmateurWriterBookService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<AmateurWriterBook> findById(@PathVariable Long id) {
        return ResponseEntity.ok(amateurWriterService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AmateurWriterBook> save(@ResponseBody AmateurWriterBook amateurWriterBook) {
        amateurWriterBook = amateurWriterService.save(amateurWriterBook);
        amateurWriterService.save(amateurWriterBook);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(amateurWriterBook.getId()).toUri();
        return ResponseEntity.created(uri).body(amateurWriterService);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        amateurWriterService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
