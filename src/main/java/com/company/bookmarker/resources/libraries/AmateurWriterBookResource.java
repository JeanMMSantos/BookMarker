package com.company.bookmarker.resources.libraries;

<<<<<<< HEAD:src/main/java/com/company/bookmarker/resources/libaries/AmateurWriterBookResource.java
import com.company.bookmarker.entities.libaries.AmateurWriterBook;
import com.company.bookmarker.services.libaries.AmateurWriterBookService;
=======
import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.services.libraries.AmateurWriterBookService;
import com.company.bookmarker.services.users.AmateurWriterService;
>>>>>>> be6275fbb6d7d051d5a0f48cd34c8736e95d3b40:src/main/java/com/company/bookmarker/resources/libraries/AmateurWriterBookResource.java
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
<<<<<<< HEAD:src/main/java/com/company/bookmarker/resources/libaries/AmateurWriterBookResource.java
    private AmateurWriterBookService amateurWriterBookService;
=======
    private AmateurWriterService amauterWriterService;
>>>>>>> be6275fbb6d7d051d5a0f48cd34c8736e95d3b40:src/main/java/com/company/bookmarker/resources/libraries/AmateurWriterBookResource.java

    @GetMapping
    public ResponseEntity<List<com.company.bookmarker.entities.libaries.AmateurWriterBook>> findAll() {
        return ResponseEntity.ok(amateurWriterBookService.findAll());
    }

    @GetMapping
    public ResponseEntity<com.company.bookmarker.entities.libaries.AmateurWriterBook> findById(@PathVariable Long id) {
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
