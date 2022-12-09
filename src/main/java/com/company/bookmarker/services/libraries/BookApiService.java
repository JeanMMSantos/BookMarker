package com.company.bookmarker.services.libaries;

import com.company.bookmarker.entities.libaries.AmateurWriterBook;
import com.company.bookmarker.entities.libaries.Book;
import com.company.bookmarker.entities.libaries.BookApi;
import com.company.bookmarker.repositories.libaries.BookApiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookApiService {


    public BookApiRepository bookApiRepository;

    public List<AmateurWriterBook> findAll() {
        return bookApiRepository.findAll();
    }

    public BookApi findById(Long id) {
        return bookApiRepository.findById(id).get();
    }

    public BookApi save(BookApi bookApi) {
        return bookApiRepository.save(bookApi);
    }

    public void delete(Long id) {
        bookApiRepository.delete(id);
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
