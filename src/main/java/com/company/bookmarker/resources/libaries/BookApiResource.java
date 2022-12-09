package com.company.bookmarker.resources.libaries;

import com.company.bookmarker.entities.libaries.BookApi;
import com.company.bookmarker.entities.users.PaidUser;
import com.company.bookmarker.services.libaries.BookApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;

@RestController
@RequestMapping(value = "/bookApi")
@Resource
public class BookApiResource {

    @Autowired
    private BookApiService bookApiService;

    @GetMapping
    public ResponseEntity<java.util.List<BookApi>> findAll() {
        return ResponseEntity.ok(bookApiService.findAll());
    }

    @GetMapping(value = "{id}") {
        return ResponseEntity.ok(bookApiService.findById(id));
    }
    @PostMapping
    public ResponseEntity<BookApi> save(@RequestBody BookApi bookApi){
        bookApi = bookApiService.save(bookApi);
        bookApiService.save(bookApi);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bookApi.getId()).toUri();
        return ResponseEntity.created(uri).body(bookApi);
    }
}
