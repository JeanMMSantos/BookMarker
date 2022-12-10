package com.company.bookmarker.services.libraries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.entities.libraries.Book;
import com.company.bookmarker.repositories.libraries.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<AmateurWriterBook> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(long id) {
        return bookRepository.findById(id).get();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public  void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public Book update(Long id, Book book) {
        Book entity = bookRepository.getById(id);
        updateData(entity, book);
        return bookRepository.save(entity);
    }

    private  void updateData(Book entity, Book book) {
        entity.setCover(book.getCover());
        entity.setName(book.getName());
        entity.setId(book.getId());
        entity.setIdioma(book.getIdioma());
        entity.setNumberOfPages(book.getNumberOfPages());
        entity.setDescription(book.getDescription());
        entity.setPublishingCompany(book.getPublishingCompany());
    }

}
