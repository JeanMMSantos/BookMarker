package com.company.bookmarker.resources.libaries;

import com.company.bookmarker.entities.libaries.Book;
import com.company.bookmarker.services.libaries.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;

@RestController
@RequestMapping(value = "/book")
@Resource
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<java.util.List<Book>> findAll() {
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

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<Void> delete(@PathVariable Long id) {
            bookService.delete(id);
            return ResponseEntity.noContent().build();
        }
    }
}
