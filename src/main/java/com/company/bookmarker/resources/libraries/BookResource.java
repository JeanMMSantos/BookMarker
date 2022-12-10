package com.company.bookmarker.resources.libraries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.entities.libraries.Book;
import com.company.bookmarker.services.libraries.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
@Resource
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<AmateurWriterBook>> findAll() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @GetMapping
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.findById(id));
    }

    @PostMapping
    public  ResponseEntity<Book> save(@RequestBody Book book) {
        book = bookService.save(book);
        bookService.save(book);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(book.getId()).toUri();
        return ResponseEntity.created(uri).body(book);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
