package com.company.bookmarker.services.libraries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.entities.libraries.BookApi;
import com.company.bookmarker.repositories.libraries.BookApiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookApiService {


    public BookApiRepository bookApiRepository;

    public List<AmateurWriterBook> findAll() {
        return bookApiRepository.findAll();
    }

    public AmateurWriterBook findById(Long id) {
        return bookApiRepository.findById(id).get();
    }

    public BookApi save(BookApi bookApi) {
        return bookApiRepository.save(bookApi);
    }

    public void delete(Long id) {
        bookApiRepository.deleteById(id);
    }

    public BookApi update(Long id, BookApi bookApi) {
        BookApi entity = bookApiRepository.getReferenceById(id);
        updateData(entity, bookApi);
        return bookApiRepository.save(entity);
    }

    public void updateData(BookApi entity, BookApi bookApi) {
        entity.setBookValue(bookApi.getBookValue);
    }

}
