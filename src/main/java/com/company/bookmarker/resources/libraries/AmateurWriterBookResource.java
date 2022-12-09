package com.company.bookmarker.resources.libaries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.services.libaries.AmateurWriterBookService;
import com.company.bookmarker.services.users.AmauterWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/amateurWriterBook")
@Resource
public class AmauteurWriterBookService {

    @Autowired
    private AmauterWriterService amauterWriterService;

    @GetMapping
    public ResponseEntity<java.util.List<AmateurWriterBook>> findAll() {
        return ResponseEntity.ok(AmateurWriterBookService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<AmateurWriterBook> findById(@PathVariable Long id) {
        return ResponseEntity.ok(amauterWriterService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AmateurWriterBook> save(@ResponseBody AmateurWriterBook amateurWriterBook) {
        amateurWriterBook = amauterWriterService.save(amateurWriterBook);
        amauterWriterService.save(amateurWriterBook);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(amateurWriterBook.getId()).toUri();
        return ResponseEntity.created(uri).body(amauterWriterService);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        amauterWriterService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
